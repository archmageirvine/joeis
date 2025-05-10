package irvine.oeis.a077;

import java.util.ArrayList;

import irvine.math.cr.CR;
import irvine.math.group.IntegersModMul;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.Quadruple;

/**
 * A077187 Smallest k such that the concatenation 123...(k-1) k (k-1)...321 ( a concatenation of natural numbers from 1 to k and back to 1) is a multiple of prime(n), or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A077187 extends A000040 {

  // After Max Alekseyev
  private static final CR ONE_TENTH = CR.valueOf(new Q(1, 10));

  @Override
  public Z next() {
    final Z p = super.next();
    if (p.equals(Z.TWO) || p.equals(Z.FIVE)) {
      return Z.ZERO;
    }
    final Z c10 = Z.TEN.mod(p);
    final IntegersModMul ring = new IntegersModMul(p);
    final Z z = ring.order(c10);
    Z u = Z.ONE;
    Z v = Z.ONE;
    Z l = Z.ONE;
    Z k = Z.TWO;
    final ArrayList<Quadruple<Z>> list = new ArrayList<>();
    while (true) {
      final Z lk = CR.ONE.add(CR.valueOf(k).add(ONE_TENTH).log10()).floor();
      if (k.equals(Z.TEN.pow(lk.subtract(1)))) {
        list.clear();
      }
      if (c10.modPow(lk.add(l), p).modMultiply(u, p).add(c10.modPow(l, p).modMultiply(k, p)).add(v).mod(p).isZero()) {
        return k;
      }
      int q = 0;
      final Quadruple<Z> t = new Quadruple<>(u, v, k.mod(p), l.mod(z));
      for (int j = 0; j < list.size(); ++j) {
        if (t.equals(list.get(j))) {
          q = list.size() - j;
        }
      }
      if (q != 0) {
        k = k.add(Z.TEN.pow(lk).subtract(1).subtract(k).divide(q).multiply(q));
        list.clear();
      } else {
        list.add(t);
      }
      u = u.modMultiply(c10.modPow(lk, p), p).add(k).mod(p);
      v = v.add(c10.modPow(l, p).modMultiply(k, p)).mod(p);
      l = l.add(lk);
      k = k.add(1);
    }
  }
}


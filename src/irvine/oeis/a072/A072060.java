package irvine.oeis.a072;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072060 Smallest prime p such that 2*p+1 has n prime factors (with multiplicity).
 * @author Sean A. Irvine
 */
public class A072060 extends Sequence1 {

  // After Daniel Suteu

  private final Fast mPrime = new Fast();
  private int mN = 0;

  private TreeSet<Z> f(final Z a, final Z b, final Z m, final Z p, final int n) {
    final TreeSet<Z> res = new TreeSet<>();
    if (n == 1) {
      final Z bm = b.divide(m);
      for (Z q = mPrime.nextPrime(a.add(m.subtract(1)).divide(m).max(p).subtract(1)); q.compareTo(bm) <= 0; q = mPrime.nextPrime(q)) {
        final Z t = q.multiply(m);
        final Z u = t.subtract(1).divide2();
        if (u.isProbablePrime()) {
          res.add(u);
        }
      }
    } else {
      final Z r = b.divide(m).root(n);
      for (Z q = p; q.compareTo(r) <= 0; q = mPrime.nextPrime(q)) {
        final Z t = q.multiply(m);
        res.addAll(f(a, b, t, q, n - 1));
      }
    }
    return res;
  }

  private TreeSet<Z> generate(Z a, final Z b, final int n) {
    a = a.max(Z.ONE.shiftLeft(n));
    return f(a, b, Z.ONE, Z.THREE, n);
  }

  @Override
  public Z next() {
    ++mN;
    Z x = Z.ONE.shiftLeft(mN);
    Z y = x.multiply2();
    while (true) {
      final TreeSet<Z> v = generate(x, y, mN);
      if (!v.isEmpty()) {
        return v.first();
      }
      x = y.add(1);
      y = x.multiply2();
    }
  }
}

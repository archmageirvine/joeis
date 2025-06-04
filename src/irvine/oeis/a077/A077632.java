package irvine.oeis.a077;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077632 LCM of terms in periodic part of continued fraction expansion of square root of 1+2^n.
 * @author Sean A. Irvine
 */
public class A077632 extends Sequence1 {

  private long mN = 0;

  protected Z lcm(final Z n) {
    final Z[] sqrt = n.sqrtAndRemainder();
    final Z f0 = sqrt[0];
    if (sqrt[1].isZero()) {
      return f0; // this seems somewhat bogus to me, answer should really be 1?
    }
    Z f = f0;
    final ArrayList<Z> p = new ArrayList<>();
    p.add(Z.ZERO);
    final ArrayList<Z> q = new ArrayList<>();
    q.add(Z.ONE);
    Z lcm = Z.ONE;
    int k = 0;
    while (true) {
      p.add(q.get(k).multiply(f).subtract(p.get(k)));
      q.add(n.subtract(p.get(k + 1).square()).divide(q.get(k)));
      ++k;
      for (int i = 0; i < k; ++i) {
        if (p.get(i).equals(p.get(k)) && q.get(i).equals(q.get(k))) {
          return lcm;
        }
      }
      f = p.get(k).add(f0).divide(q.get(k));
      lcm = lcm.lcm(f);
    }
  }

  @Override
  public Z next() {
    return lcm(Z.ONE.shiftLeft(++mN).add(1));
  }
}

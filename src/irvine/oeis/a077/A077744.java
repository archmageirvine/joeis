package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077744 Smallest number whose cube ends in n, or 0 if no such number exists. a(n) = A077743(n)^(1/3).
 * @author Sean A. Irvine
 */
public class A077744 extends Sequence1 {

  private long mN = 0;
  private long mM = 10;

  @Override
  public Z next() {
    if (++mN == mM) {
      mM *= 10;
    }
    for (long m = 1; m < mM; ++m) {
      final Z v = Z.valueOf(m);
      final Z t = v.pow(3);
      final long r = t.mod(mM);
      if (r == mN) {
        return v;
      }
    }
    return Z.ZERO;
  }
}

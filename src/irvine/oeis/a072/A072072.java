package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072005.
 * @author Sean A. Irvine
 */
public class A072072 extends Sequence1 {

  // A sieving approach is probably needed to make this competitive

  private long mM = 135;
  private long mN = -1;

  private boolean is(final long m, final long n) {
    for (long k = 1; k < n; ++k) {
      if (Jaguar.factor(m + k).maxExponent() != 3) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.EIGHT;
    }
    while (true) {
      final int e = Jaguar.factor(mM).maxExponent();
      if (e == 3) {
        final int f = Jaguar.factor(mM + mN).maxExponent();
        if (f == 3) {
          if (is(mM, mN)) {
            return Z.valueOf(mM);
          }
        } else {
          mM += mN;
        }
      }
      ++mM;
    }
  }
}

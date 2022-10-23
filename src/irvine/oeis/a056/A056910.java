package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056910 Numbers k such that 36*k^2 + 12*k + 7 is prime (sorted by absolute values with negatives before positives).
 * @author Sean A. Irvine
 */
public class A056910 extends Sequence0 {

  private boolean mFirst = true;
  private long mN = 0;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    while (true) {
      if (mN < 0) {
        mN = -mN;
      } else {
        mN = -mN - 1;
      }
      final Z t = Z.valueOf(mN).square().multiply(36).add(12 * mN + 7);
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

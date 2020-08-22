package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.Euler;
import irvine.oeis.Sequence;

/**
 * A001274 Numbers n such that phi(n) = phi(n+1).
 * @author Sean A. Irvine
 */
public class A001274 implements Sequence {

  private int mN = 0;
  private int mLimit = 0;
  private Euler mEuler = null;

  @Override
  public Z next() {
    while (true) {
      if (++mN >= mLimit) {
        mLimit = 2 * mLimit + 3;
        mEuler = new Euler(mLimit);
      }
      if (mN < 0) {
        throw new UnsupportedOperationException();
      }
      final int phi = mEuler.phi(mN);
      if (phi == mEuler.phi(mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }

}

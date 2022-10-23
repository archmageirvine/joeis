package irvine.oeis.a003;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003275 Values of phi(n) = phi(n+1).
 * @author Sean A. Irvine
 */
public class A003275 extends Sequence1 {

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
        return Z.valueOf(phi);
      }
    }
  }

}

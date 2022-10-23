package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010552 Multiply successively by 1 (once), 2 (twice), 3 (thrice), etc.
 * @author Sean A. Irvine
 */
public class A010552 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = 1;
  private long mM = 3;

  @Override
  public Z next() {
    if (--mM == 0) {
      ++mN;
      mM = mN;
    }
    mA = mA.multiply(mN);
    return mA;
  }
}

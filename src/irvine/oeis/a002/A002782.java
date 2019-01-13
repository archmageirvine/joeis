package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002782.
 * @author Sean A. Irvine
 */
public class A002782 implements Sequence {

  private Z mCurrentDivisor = Z.ONE;
  private String mCurrentConcatenation = "";
  private long mN = 0;

  @Override
  public Z next() {
    do {
      mCurrentConcatenation += ++mN;
    } while (!Z.ZERO.equals(new Z(mCurrentConcatenation).mod(mCurrentDivisor)));
    mCurrentDivisor = new Z(mCurrentConcatenation);
    mCurrentConcatenation = "";
    return mCurrentDivisor;
  }
}

package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002782 Concatenate the natural numbers, then partition into minimal strings so that each term divides the next.
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
    } while (!new Z(mCurrentConcatenation).mod(mCurrentDivisor).isZero());
    mCurrentDivisor = new Z(mCurrentConcatenation);
    mCurrentConcatenation = "";
    return mCurrentDivisor;
  }
}

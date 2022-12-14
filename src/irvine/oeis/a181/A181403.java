package irvine.oeis.a181;
// manually anopsn 1, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A181403 Total number of n-digit numbers requiring 7 positive cubes in their representation as sum of cubes.
 * @author Georg Fischer
 */
public class A181403 extends AbstractSequence {

  private A181402 mSeq1 = new A181402();
  private Z mA;
  private int mN = 0;

  /** Construct the sequence. */
  public A181403() {
    super(1);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    if (mN <= 1) {
      return Z.ONE;
    }
    final Z b = mSeq1.next();
    final Z result = b.subtract(mA);
    mA = b;
    return result;
  }
}

package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000186;

/**
 * A001626 Number of 3-line Latin rectangles.
 * @author Sean A. Irvine
 */
public class A001626 extends AbstractSequence {

  private final A000186 mSeq1 = new A000186();

  /** Construct the sequence. */
  public A001626() {
    super(1);
  }

  {
    mSeq1.next();
  }

  private int mN = -1;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.multiply(++mN).multiply2().add(mSeq1.next());
    return mA;
  }
}


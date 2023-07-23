package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000002;

/**
 * A054351 Successive generations of the Kolakoski sequence A000002.
 * @author Sean A. Irvine
 */
public class A054351 extends AbstractSequence {

  private final A000002 mSeq1 = new A000002();

  /** Construct the sequence. */
  public A054351() {
    super(0);
  }

  private final StringBuilder mS = new StringBuilder();
  private final Sequence mRowLengths = new A054352();
  private long mN = 0;

  @Override
  public Z next() {
    final long mRowLength = mRowLengths.next().longValueExact();
    while (mN < mRowLength) {
      mS.append(mSeq1.next());
      ++mN;
    }
    return new Z(mS);
  }
}

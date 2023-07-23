package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A054949 Number of labeled semi-strong digraphs on n nodes with an odd number of components.
 * @author Sean A. Irvine
 */
public class A054949 extends AbstractSequence {

  private final A054948 mSeq1 = new A054948();

  /** Construct the sequence. */
  public A054949() {
    super(1);
  }

  private final Sequence mA = new A054947();

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mA.next()).divide2();
  }
}

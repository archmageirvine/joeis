package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001998;
import irvine.oeis.a002.A002216;

/**
 * A036359 Number of branched catafusenes with n condensed hexagons.
 * @author Sean A. Irvine
 */
public class A036359 extends AbstractSequence {

  private final A002216 mSeq1 = new A002216();

  /** Construct the sequence. */
  public A036359() {
    super(1);
  }

  {
    mSeq1.next(); // skip 0
  }

  private final Sequence mA = new PrependSequence(new A001998(), 1);

  @Override
  public Z next() {
    return mSeq1.next().subtract(mA.next());
  }
}

package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000088;
import irvine.oeis.a000.A000171;

/**
 * A054960 Number of unlabeled graphs with n nodes and an odd number of edges.
 * @author Sean A. Irvine
 */
public class A054960 extends AbstractSequence {

  private final A000088 mSeq1 = new A000088();

  /** Construct the sequence. */
  public A054960() {
    super(1);
  }

  private final Sequence mA = new A000171();

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mA.next()).divide2();
  }
}

package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005176;
import irvine.oeis.a005.A005177;

/**
 * A054916 Number of connected unlabeled regular graphs with n nodes such that complement is also connected.
 * @author Sean A. Irvine
 */
public class A054916 extends AbstractSequence {

  private final A005177 mSeq1 = new A005177();

  /** Construct the sequence. */
  public A054916() {
    super(1);
  }

  private final Sequence mA = new A005176();

  {
    next();
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply2().subtract(mA.next());
  }
}

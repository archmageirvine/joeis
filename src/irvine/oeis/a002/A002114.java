package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000436;

/**
 * A002114 Glaisher's H' numbers.
 * @author Sean A. Irvine
 */
public class A002114 extends AbstractSequence {

  private final A000436 mSeq1 = new A000436();

  /** Construct the sequence. */
  public A002114() {
    super(1);
  }

  private int mN = 1;

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    mN += 2;
    return mSeq1.next().shiftRight(mN);
  }
}

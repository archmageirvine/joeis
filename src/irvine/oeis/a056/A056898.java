package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A056898 a(n) = smallest number m such that m^2+n is prime.
 * @author Sean A. Irvine
 */
public class A056898 extends AbstractSequence {

  private final A056897 mSeq1 = new A056897();

  /** Construct the sequence. */
  public A056898() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().sqrt();
  }
}

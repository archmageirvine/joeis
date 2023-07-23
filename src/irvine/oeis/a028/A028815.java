package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a008.A008578;

/**
 * A028815 a(n) = n-th prime + 1 (starting with 1).
 * @author Sean A. Irvine
 */
public class A028815 extends AbstractSequence {

  private final A008578 mSeq1 = new A008578();

  /** Construct the sequence. */
  public A028815() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(1);
  }
}

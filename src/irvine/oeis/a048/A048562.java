package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A048562 a(n+1)^2 is next smallest nontrivial square beginning with a(n)^2, initial square is 9.
 * @author Sean A. Irvine
 */
public class A048562 extends AbstractSequence {

  private final A048561 mSeq1 = new A048561();

  /** Construct the sequence. */
  public A048562() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().sqrt();
  }
}

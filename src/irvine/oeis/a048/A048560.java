package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A048560 a(n+1)^2 is next smallest nontrivial square beginning with a(n)^2, initial square is 4.
 * @author Sean A. Irvine
 */
public class A048560 extends AbstractSequence {

  private final A048559 mSeq1 = new A048559();

  /** Construct the sequence. */
  public A048560() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().sqrt();
  }
}

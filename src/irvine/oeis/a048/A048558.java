package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A048558 a(n+1)^2 is next smallest nontrivial square beginning with a(n)^2, initial square is 1.
 * @author Sean A. Irvine
 */
public class A048558 extends AbstractSequence {

  private final A048557 mSeq1 = new A048557();

  /** Construct the sequence. */
  public A048558() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().sqrt();
  }
}

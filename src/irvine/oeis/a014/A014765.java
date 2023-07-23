package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A014765 Squares of distinct elements in triangle of Eulerian numbers.
 * @author Sean A. Irvine
 */
public class A014765 extends AbstractSequence {

  private final A014630 mSeq1 = new A014630();

  /** Construct the sequence. */
  public A014765() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().square();
  }
}

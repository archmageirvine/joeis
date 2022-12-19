package irvine.oeis.a326;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a059.A059201;
import irvine.oeis.transform.LogarithmicTransformSequence;

/**
 * A326948 Number of connected T_0 set-systems on n vertices.
 * @author Georg Fischer
 */
public class A326948 extends AbstractSequence {

  private int mN = -1;
  private final LogarithmicTransformSequence mSeq1 = new LogarithmicTransformSequence(new A059201(), 1);

  /** Construct the sequence. */
  public A326948() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : mSeq1.next();
  }
}

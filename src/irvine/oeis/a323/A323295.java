package irvine.oeis.a323;
// manually andiv 

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000005;

/**
 * A323295 Number of ways to fill a matrix with the first n positive integers.
 * @author Georg Fischer
 */
public class A323295 extends AbstractSequence {

  private final A000005 mSeq1 = new A000005();
  private int mN;

  /** Construct the sequence. */
  public A323295() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : mSeq1.next().multiply(Functions.FACTORIAL.z(mN));
  }
}

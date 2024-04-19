package irvine.oeis.a306;
// manually andiv 

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007425;

/**
 * A306656 Number of ways to fill a 3D matrix with n distinct values.
 * @author Georg Fischer
 */
public class A306656 extends AbstractSequence {

  private final A007425 mSeq1 = new A007425();
  private int mN;

  /** Construct the sequence. */
  public A306656() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : mSeq1.next().multiply(Functions.FACTORIAL.z(mN));
  }
}

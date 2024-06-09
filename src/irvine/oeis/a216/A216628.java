package irvine.oeis.a216;
// manually andiv 

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a163.A163085;

/**
 * A216628 a(n) = A163085(n)/n!.
 * @author Georg Fischer
 */
public class A216628 extends AbstractSequence {

  private final A163085 mSeq1 = new A163085();
  private int mN;

  /** Construct the sequence. */
  public A216628() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(Functions.FACTORIAL.z(++mN));
  }
}

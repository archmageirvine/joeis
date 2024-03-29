package irvine.oeis.a337;
// Generated by gen_seq4.pl simgcd at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a033.A033472;

/**
 * A337274 Number of distinct graceful labelings of trees with n vertices.
 * @author Georg Fischer
 */
public class A337274 extends AbstractSequence {

  private final AbstractSequence mSeq = new A033472();

  /** Construct the sequence. */
  public A337274() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next().add(1).divide2();
  }
}

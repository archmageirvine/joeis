package irvine.oeis.a217;
// Generated by gen_seq4.pl simgcd at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a225.A225325;

/**
 * A217725 Numbers n such that 5n is a partition number.
 * @author Georg Fischer
 */
public class A217725 extends AbstractSequence {

  private final AbstractSequence mSeq = new A225325();

  /** Construct the sequence. */
  public A217725() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next().divide(5);
  }
}

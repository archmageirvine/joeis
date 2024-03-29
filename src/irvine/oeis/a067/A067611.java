package irvine.oeis.a067;
// Generated by gen_seq4.pl simgcd at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a054.A054775;

/**
 * A067611 Numbers of the form 6xy +- x +- y, where x, y are positive integers.
 * @author Georg Fischer
 */
public class A067611 extends AbstractSequence {

  private final AbstractSequence mSeq = new A054775();

  /** Construct the sequence. */
  public A067611() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next().divide(6);
  }
}

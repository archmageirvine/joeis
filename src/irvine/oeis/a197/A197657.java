package irvine.oeis.a197;
// Generated by gen_seq4.pl simgcd at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a141.A141147;

/**
 * A197657 Row sums of A194595.
 * @author Georg Fischer
 */
public class A197657 extends AbstractSequence {

  private final AbstractSequence mSeq = new A141147();

  /** Construct the sequence. */
  public A197657() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq.next().divide2();
  }
}

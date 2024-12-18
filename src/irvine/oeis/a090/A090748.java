package irvine.oeis.a090;
// Generated by gen_seq4.pl simgcd at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000043;

/**
 * A090748 Numbers k such that 2^(k+1) - 1 is prime.
 * @author Georg Fischer
 */
public class A090748 extends AbstractSequence {

  private final AbstractSequence mSeq = new A000043();

  /** Construct the sequence. */
  public A090748() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next().subtract(1);
  }
}

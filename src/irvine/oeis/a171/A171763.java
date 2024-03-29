package irvine.oeis.a171;
// Generated by gen_seq4.pl simgcd at 2023-08-27 22:03

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a004.A004754;

/**
 * A171763 Odd numbers whose binary expansion begins 10.
 * @author Georg Fischer
 */
public class A171763 extends AbstractSequence {

  private final AbstractSequence mSeq = new A004754();

  /** Construct the sequence. */
  public A171763() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next().multiply2().add(1);
  }
}

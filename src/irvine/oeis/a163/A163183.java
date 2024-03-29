package irvine.oeis.a163;
// Generated by gen_seq4.pl simgcd at 2023-08-27 22:03

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a051.A051085;

/**
 * A163183 Primes dividing 2^j + 1 for some odd j.
 * @author Georg Fischer
 */
public class A163183 extends AbstractSequence {

  private final AbstractSequence mSeq = new A051085().skip(1);

  /** Construct the sequence. */
  public A163183() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}

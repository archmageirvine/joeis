package irvine.oeis.a297;
// Generated by gen_seq4.pl simgcd at 2023-08-14 15:24

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a038.A038892;

/**
 * A297176 Inert rational primes in the field Q(sqrt(19)).
 * @author Georg Fischer
 */
public class A297176 extends AbstractSequence {

  private final AbstractSequence mSeq = new A038892().skip(1);

  /** Construct the sequence. */
  public A297176() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}

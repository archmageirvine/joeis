package irvine.oeis.a066;
// Generated by gen_seq4.pl simgcd at 2023-08-27 22:03

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a063.A063784;

/**
 * A066101 Primes of the form q = p^6 + p^3 + 1 = sigma_3(p^2), where p is prime.
 * @author Georg Fischer
 */
public class A066101 extends AbstractSequence {

  private final AbstractSequence mSeq = new A063784();

  /** Construct the sequence. */
  public A066101() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}

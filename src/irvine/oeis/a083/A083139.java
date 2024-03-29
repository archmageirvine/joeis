package irvine.oeis.a083;
// Generated by gen_seq4.pl simgcd at 2023-08-27 22:03

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002385;

/**
 * A083139 Primes in A083137.
 * @author Georg Fischer
 */
public class A083139 extends AbstractSequence {

  private final AbstractSequence mSeq = new A002385();

  /** Construct the sequence. */
  public A083139() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}

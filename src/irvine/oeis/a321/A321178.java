package irvine.oeis.a321;
// Generated by gen_seq4.pl simgcd at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a109.A109723;

/**
 * A321178 One-half the sum of the first 2n + 1 primes.
 * @author Georg Fischer
 */
public class A321178 extends AbstractSequence {

  private final AbstractSequence mSeq = new A109723();

  /** Construct the sequence. */
  public A321178() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq.next().divide2();
  }
}

package irvine.oeis.a101;
// Generated by gen_seq4.pl 2024-07-24.ack/sintrif at 2024-07-24 22:30

import irvine.math.z.Z;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A101796 Primes of the form 8*k-1 such that 4*k-1, 16*k-1 and 32*k-1 are also primes.
 * @author Georg Fischer
 */
public class A101796 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A101796() {
    super(1, (term, n) -> Z.TWO.multiply(term).add(1), "", new A101795());
  }
}

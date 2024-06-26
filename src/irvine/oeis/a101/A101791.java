package irvine.oeis.a101;
// Generated by gen_seq4.pl 2024-06-01/simtraf at 2024-06-01 22:47

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A101791 Primes of the form 4*k-1 such that 8*k-1 and 16*k-1 are also primes.
 * @author Georg Fischer
 */
public class A101791 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A101791() {
    super(1, new A101790(), v -> v.multiply(4).subtract(1));
  }
}

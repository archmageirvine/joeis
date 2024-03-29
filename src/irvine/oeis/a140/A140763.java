package irvine.oeis.a140;
// Generated by gen_seq4.pl dirtraf at 2024-02-03 12:35

import irvine.oeis.a007.A007504;
import irvine.oeis.a051.A051838;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A140763 A051838 gives numbers m such that the sum of first m primes divides the product of the first m primes. This sequence gives corresponding values of the sum of first m primes.
 * @author Georg Fischer
 */
public class A140763 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A140763() {
    super(1, new A007504(), new A051838());
  }
}

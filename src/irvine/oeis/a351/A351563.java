package irvine.oeis.a351;
// Generated by gen_seq4.pl dirtraf at 2024-02-27 20:59

import irvine.oeis.a028.A028234;
import irvine.oeis.a067.A067029;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A351563 a(n) is the exponent of the second smallest prime factor of n, or 0 if n is a power of a prime.
 * @author Georg Fischer
 */
public class A351563 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A351563() {
    super(1, new A067029(), new A028234());
  }
}

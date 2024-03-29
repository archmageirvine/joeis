package irvine.oeis.a086;
// Generated by gen_seq4.pl dirtraf at 2024-02-06 22:08

import irvine.oeis.a000.A000720;
import irvine.oeis.a051.A051674;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A086693 Number of primes less than prime(n)^prime(n).
 * @author Georg Fischer
 */
public class A086693 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A086693() {
    super(1, new A000720(), new A051674());
  }
}

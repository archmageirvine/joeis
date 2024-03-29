package irvine.oeis.a153;
// Generated by gen_seq4.pl dirtraf at 2024-02-06 22:08

import irvine.oeis.a000.A000720;
import irvine.oeis.a001.A001146;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A153450 Number of primes &lt;= 2^(2^n) = pi(A001146(n)).
 * @author Georg Fischer
 */
public class A153450 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A153450() {
    super(0, new A000720(), new A001146());
  }
}

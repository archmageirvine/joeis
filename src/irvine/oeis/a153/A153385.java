package irvine.oeis.a153;
// Generated by gen_seq4.pl dirtraf at 2024-02-06 22:08

import irvine.oeis.a000.A000720;
import irvine.oeis.a007.A007570;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A153385 Number of primes &lt;= Fibonacci(Fibonacci(n)) = pi(A007570(n)).
 * @author Georg Fischer
 */
public class A153385 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A153385() {
    super(0, new A000720(), new A007570());
  }
}

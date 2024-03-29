package irvine.oeis.a193;
// Generated by gen_seq4.pl manch4/dirtraf at 2024-03-12 13:36

import irvine.oeis.a000.A000045;
import irvine.oeis.a146.A146076;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A193294 Sum of even divisors of Fibonacci(n).
 * @author Georg Fischer
 */
public class A193294 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A193294() {
    super(1, new A146076(), new A000045());
  }
}

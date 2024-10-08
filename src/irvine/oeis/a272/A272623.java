package irvine.oeis.a272;
// Generated by gen_seq4.pl 2024-09-26.ack/filter at 2024-09-26 23:06

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000045;

/**
 * A272623 Fibonacci numbers whose first digit is equal to its last digit.
 * @author Georg Fischer
 */
public class A272623 extends FilterSequence {

  /** Construct the sequence. */
  public A272623() {
    super(1, new A000045(), (n, v) -> n != 1 && Functions.LEADING_DIGIT.i(v) == v.mod(10));
  }
}

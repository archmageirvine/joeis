package irvine.oeis.a320;
// Generated by gen_seq4.pl 2024-09-26.ack/filter at 2024-09-26 23:06

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A320585 Primes whose first digit is prime.
 * @author Georg Fischer
 */
public class A320585 extends FilterSequence {

  /** Construct the sequence. */
  public A320585() {
    super(1, new A000040(), v -> {
      final int d = Functions.LEADING_DIGIT.i(v);
      return d == 2 || d == 3 || d == 5 || d == 7;
    });
  }
}

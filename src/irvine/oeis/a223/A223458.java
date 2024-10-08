package irvine.oeis.a223;
// Generated by gen_seq4.pl 2024-09-26.ack/filter at 2024-09-26 23:06

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A223458 Primes whose first digit is a composite number.
 * @author Georg Fischer
 */
public class A223458 extends FilterSequence {

  /** Construct the sequence. */
  public A223458() {
    super(1, new A000040(), v -> {
      final int d = Functions.LEADING_DIGIT.i(v);
      return d == 9 || (d & 1) == 0 && d >= 4;
    });
  }
}

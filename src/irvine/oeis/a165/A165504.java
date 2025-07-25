package irvine.oeis.a165;
// Generated by gen_seq4.pl 2025-07-21.ack/filter at 2025-07-21 18:34

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A165504 Primes p with a digits sum of p^2 equal to 43.
 * @author Georg Fischer
 */
public class A165504 extends FilterSequence {

  /** Construct the sequence. */
  public A165504() {
    super(1, new A000040(), v -> Functions.DIGIT_SUM.l(v.square()) == 43);
  }
}

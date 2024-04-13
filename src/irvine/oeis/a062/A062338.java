package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A062338 Primes whose sum of digits is a multiple of 4.
 * @author Sean A. Irvine
 */
public class A062338 extends FilterSequence {

  /** Construct the sequence. */
  public A062338() {
    super(new A000040(), k -> (Functions.DIGIT_SUM.l(k) & 3) == 0);
  }
}

package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A062336 Primes whose sum of digits is a multiple of 7.
 * @author Sean A. Irvine
 */
public class A062336 extends FilterSequence {

  /** Construct the sequence. */
  public A062336() {
    super(new A000040(), k -> Functions.DIGIT_SUM.l(k) % 7 == 0);
  }
}

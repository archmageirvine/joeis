package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A062340 Primes whose sum of digits is a multiple of 5.
 * @author Sean A. Irvine
 */
public class A062340 extends FilterSequence {

  /** Construct the sequence. */
  public A062340() {
    super(new A000040(), k -> Functions.DIGIT_SUM.l(k) % 5 == 0);
  }
}

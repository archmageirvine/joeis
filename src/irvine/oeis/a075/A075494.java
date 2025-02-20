package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000290;

/**
 * A075494 Squares whose sum of digits exceeds the number of divisors.
 * @author Sean A. Irvine
 */
public class A075494 extends FilterSequence {

  /** Construct the sequence. */
  public A075494() {
    super(1, new A000290(), k -> Functions.DIGIT_SUM.z(k).compareTo(Functions.SIGMA0.z(k)) > 0);
  }
}


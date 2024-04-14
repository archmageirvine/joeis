package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000045;

/**
 * A065398 Fibonacci numbers whose digits sum to a prime.
 * @author Sean A. Irvine
 */
public class A065398 extends FilterSequence {

  /** Construct the sequence. */
  public A065398() {
    super(1, new A000045(), k -> Functions.DIGIT_SUM.z(k).isProbablePrime());
  }
}

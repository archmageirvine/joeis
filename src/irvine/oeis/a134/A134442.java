package irvine.oeis.a134;

import irvine.oeis.FiniteSequence;

/**
 * A134442 Last two digits of primes of form 4n+3 (A002145). Leading 0&apos;s omitted.
 * @author Georg Fischer
 */
public class A134442 extends FiniteSequence {

  /** Construct the sequence. */
  public A134442() {
    super(3, 7, 11, 19, 23, 27, 31, 39, 43, 47, 51, 59, 63, 67, 71, 79, 83, 87, 91, 99);
  }
}

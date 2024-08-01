package irvine.oeis.a113;
// manually partsumm/partsum at 2022-04-12

import irvine.oeis.a000.A000073;

/**
 * A113153 Sum of the first n nonzero tribonacci numbers, in ascending order, as bases, with the same, in descending order, as exponents.
 * @author Georg Fischer
 */
public class A113153 extends A113122 {

  /** Construct the sequence. */
  public A113153() {
    super(new A000073().skip(1));
  }
}

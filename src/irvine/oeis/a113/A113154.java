package irvine.oeis.a113;
// manually partsumm/partsum at 2022-04-12

import irvine.oeis.a000.A000032;

/**
 * A113154 Sum of the first n Lucas numbers, in ascending order, as bases, with the same, in descending order, as exponents.
 * @author Georg Fischer
 */
public class A113154 extends A113122 {

  /** Construct the sequence. */
  public A113154() {
    super(new A000032());
  }
}

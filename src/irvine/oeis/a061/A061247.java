package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A061247 Prime numbers with every digit a perfect cube, i.e., consisting of only digits 0, 1 and 8.
 * @author Sean A. Irvine
 */
public class A061247 extends FilterSequence {

  /** Construct the sequence. */
  public A061247() {
    super(new A000040(), k -> (Functions.SYNDROME.i(k) & 0b1011111100) == 0);
  }
}

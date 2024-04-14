package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A061246 Prime numbers with every digit a perfect square, i.e., consisting of only digits 0, 1, 4, 9.
 * @author Sean A. Irvine
 */
public class A061246 extends FilterSequence {

  /** Construct the sequence. */
  public A061246() {
    super(new A000040(), k -> (Functions.SYNDROME.i(k) & 0b0111101100) == 0);
  }
}

package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a053.A053057;

/**
 * A061270 Squares such that each digit is a square and the sum of the digits is a square.
 * @author Sean A. Irvine
 */
public class A061270 extends FilterSequence {

  /** Construct the sequence. */
  public A061270() {
    super(new A053057(), k -> (Functions.SYNDROME.i(k) & 0b0111101100) == 0);
  }
}

package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000290;

/**
 * A077437 Squares whose decimal digits are nonsquares (2, 3, 5, 6, 7, 8).
 * @author Sean A. Irvine
 */
public class A077437 extends FilterSequence {

  /** Construct the sequence. */
  public A077437() {
    super(1, new A000290(), k -> (Functions.SYNDROME.i(k) & 0b1000010011) == 0);
  }
}

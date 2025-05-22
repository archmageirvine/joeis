package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a046.A046030;

/**
 * A077439 Numbers k such that k and k^2 have square decimal digits.
 * @author Sean A. Irvine
 */
public class A077439 extends FilterSequence {

  /** Construct the sequence. */
  public A077439() {
    super(1, new A046030(), k -> (Functions.SYNDROME.i(k.square()) & 0b0111101100) == 0);
  }
}

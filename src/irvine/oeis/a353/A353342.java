package irvine.oeis.a353;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a014.A014263;

/**
 * A353342 Numbers k such that k and k^3 use only even digits.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A353342 extends FilterSequence {

  /** Construct the sequence. */
  public A353342() {
    super(1, new A014263(), k -> (Functions.SYNDROME.i(k.pow(3)) & 0b1010101010) == 0);
  }
}

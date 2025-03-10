package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001597;

/**
 * A076442 Odd-digit perfect powers.
 * @author Sean A. Irvine
 */
public class A076442 extends FilterSequence {

  /** Construct the sequence. */
  public A076442() {
    super(new A001597(), k -> (Functions.SYNDROME.i(k) & 0b0101010101) == 0);
  }
}

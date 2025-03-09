package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001597;

/**
 * A075767.
 * @author Sean A. Irvine
 */
public class A075787 extends FilterSequence {

  /** Construct the sequence. */
  public A075787() {
    super(new A001597(), k -> (Functions.SYNDROME.i(k) & 0b1010101010) == 0);
  }
}

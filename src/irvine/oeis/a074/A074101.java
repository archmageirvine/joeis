package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000290;

/**
 * A074101 Squares using no prime digit.
 * @author Sean A. Irvine
 */
public class A074101 extends FilterSequence {

  /** Construct the sequence. */
  public A074101() {
    super(1, new A000290(), k -> (Functions.SYNDROME.i(k) & 0b0010101100) == 0);
  }
}

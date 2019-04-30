package irvine.oeis.a285;

import irvine.oeis.LinearRecurrence;

/**
 * A285872 <code>a(n)</code> is the number of zeros of the Chebyshev <code>S(n, x)</code> polynomial (A049310) in the open interval <code>(-sqrt(3), +sqrt(3))</code>.
 * @author Sean A. Irvine
 */
public class A285872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285872() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 3, 4});
  }
}

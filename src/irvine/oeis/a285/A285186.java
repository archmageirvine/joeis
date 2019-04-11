package irvine.oeis.a285;

import irvine.oeis.LinearRecurrence;

/**
 * A285186 Expansion of <code>(x+2*x^2) / (1-2*x-2*x^2+2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A285186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285186() {
    super(new long[] {-2, 2, 2}, new long[] {0, 1, 4});
  }
}

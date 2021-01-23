package irvine.oeis.a285;

import irvine.oeis.LinearRecurrence;

/**
 * A285185 Expansion of (2*x+4*x^2) / (1-2*x-2*x^2+2*x^3).
 * @author Sean A. Irvine
 */
public class A285185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285185() {
    super(new long[] {-2, 2, 2}, new long[] {0, 2, 8});
  }
}

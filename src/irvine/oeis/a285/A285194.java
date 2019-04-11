package irvine.oeis.a285;

import irvine.oeis.LinearRecurrence;

/**
 * A285194 Expansion of <code>(1+x^2)/(1+x+x^4) mod 3</code>.
 * @author Sean A. Irvine
 */
public class A285194 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285194() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 2, 1, 1, 0, 1, 1, 1, 2, 0, 2, 0});
  }
}

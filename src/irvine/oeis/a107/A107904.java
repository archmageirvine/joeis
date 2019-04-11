package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107904 Expansion of <code>(1+6x)/(1-12x^2)</code>.
 * @author Sean A. Irvine
 */
public class A107904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107904() {
    super(new long[] {12, 0}, new long[] {1, 6});
  }
}

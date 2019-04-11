package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041826 Numerators of continued fraction convergents to <code>sqrt(434)</code>.
 * @author Sean A. Irvine
 */
public class A041826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041826() {
    super(new long[] {-1, 0, 0, 0, 250, 0, 0, 0}, new long[] {20, 21, 104, 125, 5104, 5229, 26020, 31249});
  }
}

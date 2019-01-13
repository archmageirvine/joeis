package irvine.oeis.a285;

import irvine.oeis.LinearRecurrence;

/**
 * A285188.
 * @author Sean A. Irvine
 */
public class A285188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285188() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 4, 13, 45, 95, 203, 350, 606});
  }
}

package irvine.oeis.a285;

import irvine.oeis.LinearRecurrence;

/**
 * A285197.
 * @author Sean A. Irvine
 */
public class A285197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285197() {
    super(new long[] {-3, 13, -16, 7}, new long[] {1, 1, 2, 6});
  }
}

package irvine.oeis.a285;

import irvine.oeis.LinearRecurrence;

/**
 * A285870.
 * @author Sean A. Irvine
 */
public class A285870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285870() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 0, 1, 1, 2, 1, 2});
  }
}

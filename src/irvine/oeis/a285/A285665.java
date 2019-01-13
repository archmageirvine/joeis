package irvine.oeis.a285;

import irvine.oeis.LinearRecurrence;

/**
 * A285665.
 * @author Sean A. Irvine
 */
public class A285665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285665() {
    super(new long[] {-2, 0, 2, -1, -1, 2, 1}, new long[] {2, 3, 6, 10, 17, 29, 51});
  }
}

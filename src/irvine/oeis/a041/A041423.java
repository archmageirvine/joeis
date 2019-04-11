package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041423 Denominators of continued fraction convergents to <code>sqrt(227)</code>.
 * @author Sean A. Irvine
 */
public class A041423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041423() {
    super(new long[] {-1, 0, 452, 0}, new long[] {1, 15, 451, 6780});
  }
}

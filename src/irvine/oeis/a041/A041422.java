package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041422 Numerators of continued fraction convergents to <code>sqrt(227)</code>.
 * @author Sean A. Irvine
 */
public class A041422 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041422() {
    super(new long[] {-1, 0, 452, 0}, new long[] {15, 226, 6795, 102151});
  }
}

package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081583 Third row of Pascal-(1,2,1) array A081577.
 * @author Sean A. Irvine
 */
public class A081583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081583() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 10, 46, 136});
  }
}

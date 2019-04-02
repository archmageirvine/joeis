package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080422 (n+1)(n+2)(n+3)(n+12)3^n/72.
 * @author Sean A. Irvine
 */
public class A080422 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080422() {
    super(new long[] {243, -405, 270, -90, 15}, new long[] {1, 13, 105, 675, 3780});
  }
}

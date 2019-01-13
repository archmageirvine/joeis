package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080952.
 * @author Sean A. Irvine
 */
public class A080952 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080952() {
    super(new long[] {-64, 192, -240, 160, -60, 12}, new long[] {3, 21, 112, 504, 2016, 7392});
  }
}

package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063842.
 * @author Sean A. Irvine
 */
public class A063842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063842() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 11, 66, 276, 900, 2451, 5831});
  }
}

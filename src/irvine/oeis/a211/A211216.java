package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211216.
 * @author Sean A. Irvine
 */
public class A211216 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211216() {
    super(new long[] {1, -15, 35, -28, 9}, new long[] {1, 1, 2, 5, 14});
  }
}

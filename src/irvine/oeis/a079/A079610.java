package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079610.
 * @author Sean A. Irvine
 */
public class A079610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079610() {
    super(new long[] {-1, 4, -6, 4}, new long[] {15, 480, 2145, 5760});
  }
}

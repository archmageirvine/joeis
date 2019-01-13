package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086020.
 * @author Sean A. Irvine
 */
public class A086020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086020() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 17, 117, 517, 1742, 4878, 11934, 26334});
  }
}

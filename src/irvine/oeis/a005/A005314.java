package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005314.
 * @author Sean A. Irvine
 */
public class A005314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005314() {
    super(new long[] {1, -1, 2}, new long[] {0, 1, 2});
  }
}

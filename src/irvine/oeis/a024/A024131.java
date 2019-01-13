package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024131.
 * @author Sean A. Irvine
 */
public class A024131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024131() {
    super(new long[] {-11, 56, -115, 120, -65, 16}, new long[] {1, 10, 105, 1250, 14385, 160426});
  }
}

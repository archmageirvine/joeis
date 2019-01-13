package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077920.
 * @author Sean A. Irvine
 */
public class A077920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077920() {
    super(new long[] {-1, 0, 3, -1}, new long[] {1, -1, 4, -7});
  }
}

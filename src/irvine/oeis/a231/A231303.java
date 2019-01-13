package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231303.
 * @author Sean A. Irvine
 */
public class A231303 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231303() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 16, 82, 272, 707});
  }
}

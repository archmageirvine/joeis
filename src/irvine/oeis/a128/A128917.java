package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128917.
 * @author Sean A. Irvine
 */
public class A128917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128917() {
    super(new long[] {1, -63, 63}, new long[] {1, 51, 3151});
  }
}

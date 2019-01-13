package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226694.
 * @author Sean A. Irvine
 */
public class A226694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226694() {
    super(new long[] {-1, 4098}, new long[] {1, 4099});
  }
}

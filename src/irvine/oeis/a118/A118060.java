package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118060.
 * @author Sean A. Irvine
 */
public class A118060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118060() {
    super(new long[] {1, -3, 3}, new long[] {1, 4060, 11481});
  }
}

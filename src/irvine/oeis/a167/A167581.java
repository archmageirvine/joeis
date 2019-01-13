package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167581.
 * @author Sean A. Irvine
 */
public class A167581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167581() {
    super(new long[] {-16, 32, -24, 8}, new long[] {-1, 0, 28, 192});
  }
}

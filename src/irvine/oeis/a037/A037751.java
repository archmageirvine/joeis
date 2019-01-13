package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037751.
 * @author Sean A. Irvine
 */
public class A037751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037751() {
    super(new long[] {-4, 5, -5, 5}, new long[] {2, 11, 45, 180});
  }
}

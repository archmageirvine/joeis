package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037528.
 * @author Sean A. Irvine
 */
public class A037528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037528() {
    super(new long[] {-3, 1, 0, 3}, new long[] {1, 4, 14, 43});
  }
}

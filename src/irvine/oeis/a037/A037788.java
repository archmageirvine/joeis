package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037788.
 * @author Sean A. Irvine
 */
public class A037788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037788() {
    super(new long[] {-6, 7, -7, 7}, new long[] {3, 20, 120, 721});
  }
}

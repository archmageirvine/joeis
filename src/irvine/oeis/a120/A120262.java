package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120262 Sequence relating to the benzene ring.
 * @author Sean A. Irvine
 */
public class A120262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120262() {
    super(new long[] {-4, 0, 14, -5, -6, 5}, new long[] {1, 2, 4, 7, 14, 30});
  }
}

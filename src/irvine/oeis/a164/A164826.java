package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164826 Sequences A087800 and A077416 interleaved.
 * @author Sean A. Irvine
 */
public class A164826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164826() {
    super(1, new long[] {-1, 0, 12, 0}, new long[] {2, 1, 12, 13});
  }
}

package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226202 9^n + n.
 * @author Sean A. Irvine
 */
public class A226202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226202() {
    super(new long[] {9, -19, 11}, new long[] {1, 10, 83});
  }
}

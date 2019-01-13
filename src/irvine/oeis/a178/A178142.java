package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178142.
 * @author Sean A. Irvine
 */
public class A178142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178142() {
    super(new long[] {1, 1, 0, -1}, new long[] {0, 2, 3, 2});
  }
}

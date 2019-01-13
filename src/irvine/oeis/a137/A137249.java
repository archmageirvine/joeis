package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137249.
 * @author Sean A. Irvine
 */
public class A137249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137249() {
    super(new long[] {1, -1, 1, 2}, new long[] {2, 2, 7, 15});
  }
}

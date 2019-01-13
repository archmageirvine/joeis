package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187003.
 * @author Sean A. Irvine
 */
public class A187003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187003() {
    super(new long[] {1, 2, 3, 3, 2, 1}, new long[] {1, 1, 3, 8, 20, 50});
  }
}

package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187093.
 * @author Sean A. Irvine
 */
public class A187093 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187093() {
    super(new long[] {1, -3, 4, -4, 3}, new long[] {0, 1, 1, 3, 8});
  }
}

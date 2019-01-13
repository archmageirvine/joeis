package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027558.
 * @author Sean A. Irvine
 */
public class A027558 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027558() {
    super(new long[] {4, 2, -8, 1, 3}, new long[] {0, 0, 0, 0, 2});
  }
}

package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027694.
 * @author Sean A. Irvine
 */
public class A027694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027694() {
    super(new long[] {1, -3, 3}, new long[] {9, 11, 15});
  }
}

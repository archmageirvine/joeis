package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289877.
 * @author Sean A. Irvine
 */
public class A289877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289877() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 8, 19, 36, 60});
  }
}

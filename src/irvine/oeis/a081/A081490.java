package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081490.
 * @author Sean A. Irvine
 */
public class A081490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081490() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 2, 4, 9});
  }
}

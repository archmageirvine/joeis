package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063521.
 * @author Sean A. Irvine
 */
public class A063521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063521() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 16, 59});
  }
}

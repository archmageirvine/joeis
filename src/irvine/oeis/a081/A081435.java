package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081435.
 * @author Sean A. Irvine
 */
public class A081435 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081435() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 5, 18, 46});
  }
}

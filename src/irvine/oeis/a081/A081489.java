package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081489.
 * @author Sean A. Irvine
 */
public class A081489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081489() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 3, 8, 18});
  }
}

package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269098.
 * @author Sean A. Irvine
 */
public class A269098 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269098() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, 2, 3, 3, 4, 7});
  }
}

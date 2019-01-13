package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282153.
 * @author Sean A. Irvine
 */
public class A282153 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282153() {
    super(new long[] {-2, 5, -6, 4}, new long[] {0, 1, 2, 5});
  }
}

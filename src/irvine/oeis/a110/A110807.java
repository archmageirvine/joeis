package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110807.
 * @author Sean A. Irvine
 */
public class A110807 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110807() {
    super(new long[] {-100, 220, -141, 22}, new long[] {0, 9, 198, 2997});
  }
}

package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217947.
 * @author Sean A. Irvine
 */
public class A217947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217947() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {11, 37, 87, 172, 305});
  }
}

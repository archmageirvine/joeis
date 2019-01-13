package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217571.
 * @author Sean A. Irvine
 */
public class A217571 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217571() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 4, 5, 10, 11});
  }
}

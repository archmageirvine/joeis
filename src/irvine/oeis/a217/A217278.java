package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217278.
 * @author Sean A. Irvine
 */
public class A217278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217278() {
    super(new long[] {1, 0, -1, 0, -34, 0, 34, 0, 1, 0}, new long[] {0, 0, 1, 3, 10, 15, 45, 120, 351, 528});
  }
}

package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217894.
 * @author Sean A. Irvine
 */
public class A217894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217894() {
    super(new long[] {1, -2, 0, 2}, new long[] {-23, 17, 7, 97});
  }
}

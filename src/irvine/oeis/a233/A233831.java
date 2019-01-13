package irvine.oeis.a233;

import irvine.oeis.LinearRecurrence;

/**
 * A233831.
 * @author Sean A. Irvine
 */
public class A233831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233831() {
    super(new long[] {1, -2, -2}, new long[] {-1, 1, 1});
  }
}

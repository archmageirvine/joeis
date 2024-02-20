package irvine.oeis.a217;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A217975 Integers k such that 2*k^2 - 7 is a square.
 * @author Sean A. Irvine
 */
public class A217975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217975() {
    super(1, new long[] {-1, 0, 6, 0}, new long[] {2, 4, 8, 22});
  }
}

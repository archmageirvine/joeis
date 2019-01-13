package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185918.
 * @author Sean A. Irvine
 */
public class A185918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185918() {
    super(new long[] {1, -3, 3}, new long[] {-1, 9, 43});
  }
}

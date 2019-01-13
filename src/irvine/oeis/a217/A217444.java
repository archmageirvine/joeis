package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217444.
 * @author Sean A. Irvine
 */
public class A217444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217444() {
    super(new long[] {1, 0, 0, -17, 0, 0, 10, 0, 0}, new long[] {0, 1, 1, 5, 22, 13, 52, 204, 113});
  }
}

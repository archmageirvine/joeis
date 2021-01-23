package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153349 Period 6: repeat [1, 7, 4, 4, 7, 1].
 * @author Sean A. Irvine
 */
public class A153349 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153349() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {1, 7, 4, 4, 7});
  }
}

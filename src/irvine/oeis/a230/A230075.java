package irvine.oeis.a230;

import irvine.oeis.LinearRecurrence;

/**
 * A230075 Period 8: repeat [2, 1, 0, 1, -2, -1, 0, -1].
 * @author Sean A. Irvine
 */
public class A230075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230075() {
    super(new long[] {-1, 0, 0, 0}, new long[] {2, 1, 0, 1});
  }
}

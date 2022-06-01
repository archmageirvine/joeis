package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153186 Period 9: repeat 1,7,4,7,4,7,1,1,1.
 * @author Sean A. Irvine
 */
public class A153186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153186() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 7, 4, 7, 4, 7, 1, 1, 1});
  }
}

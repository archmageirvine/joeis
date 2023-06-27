package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144478 Period 9: repeat 1,0,5,7,6,2,4,3,8.
 * @author Sean A. Irvine
 */
public class A144478 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144478() {
    super(1, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 5, 7, 6, 2, 4, 3, 8});
  }
}

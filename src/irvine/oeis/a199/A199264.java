package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199264 Period 18: repeat <code>(9,8,7,6,5,4,3,2,1,0,1,2,3,4,5,6,7,8)</code>.
 * @author Sean A. Irvine
 */
public class A199264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199264() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
  }
}

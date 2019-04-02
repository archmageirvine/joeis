package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158137 Period 9: repeat -2,4,-2,4,-2,-2,1,1,-2.
 * @author Sean A. Irvine
 */
public class A158137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158137() {
    super(new long[] {-1, -1, -1, -1, -1, -1, -1, -1}, new long[] {-2, 4, -2, 4, -2, -2, 1, 1});
  }
}

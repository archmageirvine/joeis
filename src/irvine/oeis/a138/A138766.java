package irvine.oeis.a138;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A138766 Real part of upper left and lower right terms of [1,(1+I); 1,1]^n * [1,0].
 * @author Sean A. Irvine
 */
public class A138766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138766() {
    super(1, new long[] {-1, 0, -4, 4}, new long[] {1, 2, 4, 7});
  }
}

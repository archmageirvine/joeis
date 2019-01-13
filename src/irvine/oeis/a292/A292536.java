package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292536.
 * @author Sean A. Irvine
 */
public class A292536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292536() {
    super(new long[] {-1, 5, -10, 26, -14, 7}, new long[] {1, 8, 48, 255, 1310, 6773});
  }
}

package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168309 Period 2: repeat 4,-3.
 * @author Sean A. Irvine
 */
public class A168309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168309() {
    super(1, new long[] {1, 0}, new long[] {4, -3});
  }
}

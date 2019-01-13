package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049086.
 * @author Sean A. Irvine
 */
public class A049086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049086() {
    super(new long[] {1, -3, 5}, new long[] {1, 3, 13});
  }
}

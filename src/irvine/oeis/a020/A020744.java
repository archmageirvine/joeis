package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020744.
 * @author Sean A. Irvine
 */
public class A020744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020744() {
    super(new long[] {-1, 2}, new long[] {8, 10});
  }
}

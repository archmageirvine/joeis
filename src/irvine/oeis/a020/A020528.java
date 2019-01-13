package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020528.
 * @author Sean A. Irvine
 */
public class A020528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020528() {
    super(new long[] {64, -56, 14}, new long[] {0, 18, 252});
  }
}

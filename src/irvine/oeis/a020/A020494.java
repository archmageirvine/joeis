package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020494.
 * @author Sean A. Irvine
 */
public class A020494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020494() {
    super(new long[] {450, -185, 24}, new long[] {1, 24, 391});
  }
}

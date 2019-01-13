package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020573.
 * @author Sean A. Irvine
 */
public class A020573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020573() {
    super(new long[] {462, -185, 24}, new long[] {1, 24, 391});
  }
}

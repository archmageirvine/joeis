package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224455.
 * @author Sean A. Irvine
 */
public class A224455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224455() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {42, 396, 1656, 4740, 10890});
  }
}

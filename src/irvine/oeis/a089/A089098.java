package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089098.
 * @author Sean A. Irvine
 */
public class A089098 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089098() {
    super(new long[] {1, 2, 0, 0, -1, -4, 2, 2}, new long[] {1, 1, 3, 5, 11, 19, 37, 65});
  }
}

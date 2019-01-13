package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291238.
 * @author Sean A. Irvine
 */
public class A291238 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291238() {
    super(new long[] {1, 4, 2, -6, -2, 4}, new long[] {4, 11, 30, 79, 202, 508});
  }
}

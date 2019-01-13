package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094832.
 * @author Sean A. Irvine
 */
public class A094832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094832() {
    super(new long[] {1, -9, 6}, new long[] {1, 3, 10});
  }
}

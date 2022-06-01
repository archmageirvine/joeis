package irvine.oeis.a061;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A061462 The exact power of 2 that divides the n-th Bell number (A000110). Has period 12.
 * @author Sean A. Irvine
 */
public class A061462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061462() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 1, 1, 4, 1, 1, 4, 1, 1, 2});
  }
}

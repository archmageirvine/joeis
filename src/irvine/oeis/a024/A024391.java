package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024391.
 * @author Sean A. Irvine
 */
public class A024391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024391() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {10, 66, 231, 595, 1275});
  }
}

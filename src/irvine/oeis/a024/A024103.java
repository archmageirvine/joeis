package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024103 9^n-n^2.
 * @author Sean A. Irvine
 */
public class A024103 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024103() {
    super(new long[] {-9, 28, -30, 12}, new long[] {1, 8, 77, 720});
  }
}

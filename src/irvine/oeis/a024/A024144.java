package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024144 a(n) = 12^n - n^4.
 * @author Sean A. Irvine
 */
public class A024144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024144() {
    super(new long[] {-12, 61, -125, 130, -70, 17}, new long[] {1, 11, 128, 1647, 20480, 248207});
  }
}

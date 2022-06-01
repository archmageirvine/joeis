package irvine.oeis.a102;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A102651 a(n) = 4 * floor(23*2^n/15).
 * @author Sean A. Irvine
 */
public class A102651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102651() {
    super(new long[] {-2, 1, 0, 0, 2}, new long[] {4, 12, 24, 48, 96});
  }
}

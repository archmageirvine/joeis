package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024037 a(n) = 4^n - n.
 * @author Sean A. Irvine
 */
public class A024037 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024037() {
    super(new long[] {4, -9, 6}, new long[] {1, 3, 14});
  }
}

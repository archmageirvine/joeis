package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024115 a(n) = 10^n - n.
 * @author Sean A. Irvine
 */
public class A024115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024115() {
    super(new long[] {10, -21, 12}, new long[] {1, 9, 98});
  }
}

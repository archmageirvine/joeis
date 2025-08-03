package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157622 a(n) = 31250*n - 9100.
 * @author Sean A. Irvine
 */
public class A157622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157622() {
    super(1, new long[] {-1, 2}, new long[] {22150, 53400});
  }
}

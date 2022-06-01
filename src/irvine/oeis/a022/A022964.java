package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022964 a(n) = 8-n.
 * @author Sean A. Irvine
 */
public class A022964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022964() {
    super(new long[] {-1, 2}, new long[] {8, 7});
  }
}

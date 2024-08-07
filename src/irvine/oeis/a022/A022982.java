package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022982 a(n) = 26-n.
 * @author Sean A. Irvine
 */
public class A022982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022982() {
    super(new long[] {-1, 2}, new long[] {26, 25});
  }
}

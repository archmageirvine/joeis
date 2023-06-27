package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174132 2*3^(n-1)-(-1)^n.
 * @author Sean A. Irvine
 */
public class A174132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174132() {
    super(1, new long[] {3, 2}, new long[] {3, 5});
  }
}

package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084132 a(n) = 4a(n-1) + 6a(n-2), a(0)=1, a(1)=2.
 * @author Sean A. Irvine
 */
public class A084132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084132() {
    super(new long[] {6, 4}, new long[] {1, 2});
  }
}

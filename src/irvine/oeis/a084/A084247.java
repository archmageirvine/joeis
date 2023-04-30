package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084247 a(n) = -a(n-1) + 2*a(n-2), a(0)=1, a(1)=2.
 * @author Sean A. Irvine
 */
public class A084247 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084247() {
    super(new long[] {2, -1}, new long[] {1, 2});
  }
}

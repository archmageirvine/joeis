package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084326 a(0)=0, a(1)=1; for n&gt;1, a(n) = 6*a(n-1)-4*a(n-2).
 * @author Sean A. Irvine
 */
public class A084326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084326() {
    super(new long[] {-4, 6}, new long[] {0, 1});
  }
}

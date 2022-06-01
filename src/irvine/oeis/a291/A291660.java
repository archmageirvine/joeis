package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291660 a(n) = 2*a(n-1) - a(n-2) + a(n-4) for n&gt;3, a(0)=2, a(1)=3, a(2)=5, a(3)=7, a sequence related to Lucas numbers.
 * @author Sean A. Irvine
 */
public class A291660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291660() {
    super(new long[] {1, 0, -1, 2}, new long[] {2, 3, 5, 7});
  }
}

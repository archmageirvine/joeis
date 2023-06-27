package irvine.oeis.a261;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A261038 a(1)=1; for n&gt;1: a(n) = a(n-1)*n if t=0, a(n) = round(a(n-1)/n) if t=1, a(n) = a(n-1)+n if t=2, a(n) = a(n-1)-n if t=3, where t = n mod 4.
 * @author Sean A. Irvine
 */
public class A261038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261038() {
    super(1, new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {1, 3, 0, 0, 0, 6, -1, -8, -1, 9, -2, -24});
  }
}

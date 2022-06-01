package irvine.oeis.a280;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A280308 Tribonacci numbers: a(n) = a(n-1) + a(n-2) + a(n-3) with a(0)=3, a(1)=4, a(2)=5.
 * @author Sean A. Irvine
 */
public class A280308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280308() {
    super(new long[] {1, 1, 1}, new long[] {3, 4, 5});
  }
}

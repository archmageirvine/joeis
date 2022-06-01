package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053141 a(0)=0, a(1)=2 then a(n) = a(n-2) + 2*sqrt(8*a(n-1)^2 + 8*a(n-1) + 1).
 * @author Sean A. Irvine
 */
public class A053141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053141() {
    super(new long[] {1, -7, 7}, new long[] {0, 2, 14});
  }
}

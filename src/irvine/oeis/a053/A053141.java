package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053141 <code>a(0)=0, a(1)=2</code> then <code>a(n) = a(n-2) + 2*sqrt(8*a(n-1)^2 + 8*a(n-1) + 1)</code>.
 * @author Sean A. Irvine
 */
public class A053141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053141() {
    super(new long[] {1, -7, 7}, new long[] {0, 2, 14});
  }
}

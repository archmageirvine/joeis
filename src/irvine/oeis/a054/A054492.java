package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054492 a(n) = 3*a(n-1) - a(n-2), a(0)=1, a(1)=6.
 * @author Sean A. Irvine
 */
public class A054492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054492() {
    super(new long[] {-1, 3}, new long[] {1, 6});
  }
}

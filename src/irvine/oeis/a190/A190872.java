package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190872 a(n) = 11*a(n-1) - 9*a(n-2), a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190872() {
    super(new long[] {-9, 11}, new long[] {0, 1});
  }
}

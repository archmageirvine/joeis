package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105635 a(n) = (2*Pell(n+2) - (1+(-1)^n))/4.
 * @author Sean A. Irvine
 */
public class A105635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105635() {
    super(new long[] {-1, -2, 2, 2}, new long[] {0, 1, 2, 6});
  }
}

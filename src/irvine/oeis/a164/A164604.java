package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164604 a(n) = ((1+4*sqrt(2))*(3+2*sqrt(2))^n + (1-4*sqrt(2))*(3-2*sqrt(2))^n)/2.
 * @author Sean A. Irvine
 */
public class A164604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164604() {
    super(new long[] {-1, 6}, new long[] {1, 19});
  }
}

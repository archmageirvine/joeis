package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215503 a(n) = (u+1)^n + (-s-1)^n + (t+1)^n + (-1)^n + (-t+1)^n + (s-1)^n + (-u+1)^n where s = sqrt(2), t = sqrt(2-s), u = sqrt(2+s).
 * @author Sean A. Irvine
 */
public class A215503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215503() {
    super(new long[] {-1, 5, 1, -17, -5, 9, 1}, new long[] {7, 1, 19, 13, 111, 121, 763});
  }
}

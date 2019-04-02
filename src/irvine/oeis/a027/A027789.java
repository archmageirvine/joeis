package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027789 a(n) = 2*(n+1)*binomial(n+3,4).
 * @author Sean A. Irvine
 */
public class A027789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027789() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {4, 30, 120, 350, 840, 1764});
  }
}

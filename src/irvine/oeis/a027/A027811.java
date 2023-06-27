package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027811 a(n) = 3*(n+1)*binomial(n+5,6).
 * @author Sean A. Irvine
 */
public class A027811 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027811() {
    super(1, new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {6, 63, 336, 1260, 3780, 9702, 22176, 46332});
  }
}

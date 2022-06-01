package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027800 a(n) = (n+1)*binomial(n+4, 4).
 * @author Sean A. Irvine
 */
public class A027800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027800() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 10, 45, 140, 350, 756});
  }
}

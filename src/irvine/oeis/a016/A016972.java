package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016972 a(n) = (6*n + 5)^4.
 * @author Sean A. Irvine
 */
public class A016972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016972() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {625, 14641, 83521, 279841, 707281});
  }
}

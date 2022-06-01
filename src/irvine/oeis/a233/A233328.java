package irvine.oeis.a233;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A233328 a(n) = (2*8^(n+1) - 9) / 7.
 * @author Sean A. Irvine
 */
public class A233328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233328() {
    super(new long[] {-8, 9}, new long[] {1, 17});
  }
}

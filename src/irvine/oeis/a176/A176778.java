package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176778 2^n-n*(n+2).
 * @author Sean A. Irvine
 */
public class A176778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176778() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, -1, -4, -7});
  }
}

package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022285 <code>a(n) = n*(27*n + 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A022285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022285() {
    super(new long[] {1, -3, 3}, new long[] {0, 14, 55});
  }
}

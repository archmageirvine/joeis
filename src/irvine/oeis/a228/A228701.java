package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228701 a(n) = 2^(n-1)*(3^n-2^(n+1)+1).
 * @author Sean A. Irvine
 */
public class A228701 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228701() {
    super(new long[] {48, -44, 12}, new long[] {0, 0, 4});
  }
}

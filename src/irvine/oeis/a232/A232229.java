package irvine.oeis.a232;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A232229 a(1)=9; thereafter a(n) = 8*10^(n-1) + 8 + a(n-1).
 * @author Sean A. Irvine
 */
public class A232229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232229() {
    super(new long[] {10, -21, 12}, new long[] {9, 97, 905});
  }
}

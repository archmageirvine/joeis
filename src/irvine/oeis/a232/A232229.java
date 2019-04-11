package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232229 <code>a(1)=9</code>; thereafter <code>a(n) = 8*10^(n-1) + 8 + a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A232229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232229() {
    super(new long[] {10, -21, 12}, new long[] {9, 97, 905});
  }
}

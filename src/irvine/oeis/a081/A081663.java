package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081663 F(2n+1)+n*2^(n-1).
 * @author Sean A. Irvine
 */
public class A081663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081663() {
    super(new long[] {-4, 16, -17, 7}, new long[] {1, 3, 9, 25});
  }
}

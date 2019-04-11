package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157730 <code>a(n) = 441*n^2 - 488*n + 135</code>.
 * @author Sean A. Irvine
 */
public class A157730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157730() {
    super(new long[] {1, -3, 3}, new long[] {88, 923, 2640});
  }
}

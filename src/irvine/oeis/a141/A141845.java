package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141845 <code>a(n) = 5*a(n-1) +</code> A047201(n), <code>a(1) = 1</code>. A047201 = numbers not divisible by 5: <code>(1, 2, 3, 4, 6, 7, 8, 9, 11,...)</code>.
 * @author Sean A. Irvine
 */
public class A141845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141845() {
    super(new long[] {5, -6, 1, 0, -5, 6}, new long[] {1, 7, 38, 194, 976, 4887});
  }
}

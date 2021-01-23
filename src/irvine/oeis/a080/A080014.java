package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080014 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, i=1..n, with k=2, r=2, I={1}.
 * @author Sean A. Irvine
 */
public class A080014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080014() {
    super(new long[] {-1, -1, 1, 1, 1, 1}, new long[] {1, 1, 1, 3, 6, 10});
  }
}

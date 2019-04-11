package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079960 Number of permutations satisfying -k <code>&lt;=</code> p(i) - i <code>&lt;=</code> r and p(i) - i not in I, i=1..n, with k=1, r=5, I={2,3}.
 * @author Sean A. Irvine
 */
public class A079960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079960() {
    super(new long[] {1, 1, 0, 0, 1, 1}, new long[] {1, 1, 2, 3, 5, 9});
  }
}

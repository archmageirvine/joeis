package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079997 Number of permutations satisfying -k&lt;=p(i)-i&lt;=r and p(i)-i not in I, i=1..n, with k=3, r=3, I={0}.
 * @author Sean A. Irvine
 */
public class A079997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079997() {
    super(new long[] {1, 1, -1, 0, 0, -2, -10, -12, 0, 10, 6, 0, 3, 1}, new long[] {1, 0, 1, 2, 9, 24, 57, 140, 376, 1016, 2692, 7020, 18369, 48344});
  }
}

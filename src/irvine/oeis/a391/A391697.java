package irvine.oeis.a391;

import irvine.oeis.a336.A336282;

/**
 * A391181 Total sum of 132 patterns in all heapable permutations of length n.
 * @author Sean A. Irvine
 */
public class A391697 extends A336282 {

  /** Construct the sequence. */
  public A391697() {
    super(1);
  }

  @Override
  protected long count(final int[] p) {
    int cnt = 0;
    for (int k = 0; k < p.length - 2; ++k) {
      for (int j = k + 1; j < p.length - 1; ++j) {
        if (p[k] > p[j]) {
          for (int i = j + 1; i < p.length; ++i) {
            if (p[k] < p[i]) {
              ++cnt;
            }
          }
        }
      }
    }
    return cnt;
  }
}

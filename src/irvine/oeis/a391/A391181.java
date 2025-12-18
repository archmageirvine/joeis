package irvine.oeis.a391;

import irvine.oeis.a336.A336282;

/**
 * A391181 allocated for Manolopoulos Panagiotis.
 * @author Sean A. Irvine
 */
public class A391181 extends A336282 {

  /** Construct the sequence. */
  public A391181() {
    super(1);
  }

  @Override
  protected long count(final int[] p) {
    int cnt = 0;
    for (int k = 0; k < p.length - 2; ++k) {
      for (int j = k + 1; j < p.length - 1; ++j) {
        if (p[k] < p[j]) {
          for (int i = j + 1; i < p.length; ++i) {
            if (p[j] > p[i] && p[k] < p[i]) {
              ++cnt;
            }
          }
        }
      }
    }
    return cnt;
  }
}

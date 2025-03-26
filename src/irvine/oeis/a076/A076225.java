package irvine.oeis.a076;

import irvine.math.z.Z;

/**
 * A076225 Counts of the maximum value in n-th row of A076221.
 * @author Sean A. Irvine
 */
public class A076225 extends A076221 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.NEG_ONE;
    long cnt = 0;
    for (long k = 0; k < mN; ++k) {
      final Z t = super.next();
      if (t.compareTo(max) >= 0) {
        if (t.equals(max)) {
          ++cnt;
        } else {
          max = t;
          cnt = 1;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}

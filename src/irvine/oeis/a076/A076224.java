package irvine.oeis.a076;

import irvine.math.z.Z;

/**
 * A076221.
 * @author Sean A. Irvine
 */
public class A076224 extends A076221 {

  private long mN = 0;

  @Override
  public Z next() {
    Z min = Z.valueOf(++mN);
    long cnt = 0;
    for (long k = 0; k < mN; ++k) {
      final Z t = super.next();
      if (t.compareTo(min) <= 0) {
        if (t.equals(min)) {
          ++cnt;
        } else {
          min = t;
          cnt = 1;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}

package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026104 a(n) = greatest number in row n of A026098 that is not a positive power of 2.
 * @author Sean A. Irvine
 */
public class A026104 extends A026098 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ONE;
    for (long k = 0; k < mN; ++k) {
      final Z t = super.next();
      if (t.bitCount() > 1) {
        max = max.max(t);
      }
    }
    return max;
  }
}

package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025526 Number of positive integers that are not the sum of distinct numbers of form k^2 + n.
 * @author Sean A. Irvine
 */
public class A025526 extends A025525 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long c = 0;
    long last = 0;
    while (last < 20) {
      if (!isSum(mN, ++last)) {
        ++c;
      }
    }
    long k = last;
    do {
      if (!isSum(mN, ++k)) {
        last = k;
        ++c;
      }
    } while (k < 2 * last + 2); // heuristic
    return Z.valueOf(c);
  }
}

package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000003 Number of classes of primitive positive definite binary quadratic forms of discriminant D = -4n; or equivalently the class number of the quadratic order of discriminant D = -4n.
 * @author Sean A. Irvine
 */
public class A000003 implements Sequence {

  private long mD = 0;

  // Cf. Cohen 5.3.5 and implementation in LongUtils.
  // This one has primitiveness check

  /**
   * Compute the class number for a discriminant.
   * @param discriminant the discriminant
   * @return class number
   */
  public static long classNumber(final long discriminant) {
    long h = 1;
    final long bLimit = LongUtils.sqrt(-discriminant / 3);
    for (long b = discriminant & 1; b <= bLimit; b += 2) {
      final long q = (b * b - discriminant) / 4;
      for (long a = b <= 1 ? 2 : b; a * a <= q; ++a) {
        if (q % a == 0 && LongUtils.gcd(q / a, a, b) == 1) {
          h += a == b || b == 0 || a * a == q ? 1 : 2;
        }
      }
    }
    return h;
  }

  @Override
  public Z next() {
    mD -= 4;
    return Z.valueOf(classNumber(mD));
  }
}

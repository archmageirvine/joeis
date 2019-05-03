package irvine.oeis.a020;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020885 Ordered areas (divided by <code>6)</code> of primitive Pythagorean triangles (with multiple entries).
 * @author Sean A. Irvine
 */
public class A020885 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    while (mM == 0) {
      final long area2 = 12 * ++mN;
      for (final Z d : Cheetah.factor(area2).divisorsSorted()) {
        final long a = d.longValue();
        final long b = area2 / a;
        if (a > b) {
          break;
        }
        if (LongUtils.gcd(a, b) == 1) {
          final long c2 = a * a + b * b;
          final long s = LongUtils.sqrt(c2);
          if (s * s == c2 && LongUtils.gcd(s, a) == 1 && LongUtils.gcd(s, b) == 1) {
            ++mM;
          }
        }
      }
    }
    --mM;
    return Z.valueOf(mN);
  }
}

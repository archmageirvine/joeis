package irvine.oeis.a020;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020885 Ordered areas (divided by 6) of primitive Pythagorean triangles (with multiple entries).
 * @author Sean A. Irvine
 */
public class A020885 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    while (mM == 0) {
      final long area2 = 12 * ++mN;
      for (final Z d : Jaguar.factor(area2).divisorsSorted()) {
        final long a = d.longValue();
        final long b = area2 / a;
        if (a > b) {
          break;
        }
        if (Functions.GCD.l(a, b) == 1) {
          final long c2 = a * a + b * b;
          final long s = Functions.SQRT.l(c2);
          if (s * s == c2 && Functions.GCD.l(s, a) == 1 && Functions.GCD.l(s, b) == 1) {
            ++mM;
          }
        }
      }
    }
    --mM;
    return Z.valueOf(mN);
  }
}

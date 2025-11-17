package irvine.oeis.a081;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081873 Ordered semiperimeter of primitive Pythagorean triangles with an odd short leg (or an even long leg).
 * @author Sean A. Irvine
 */
public class A081873 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      ++mN; // semiperimeter
      final Z lower = Functions.SQRT.z(mN);
      final Z upper = Functions.SQRT.z(mN * 2 - 1);
      for (final Z d : Jaguar.factor(mN).divisors()) {
        if (d.isOdd() && lower.compareTo(d) < 0 && d.compareTo(upper) <= 0 && Functions.GCD.l(d, mN / d.longValue()) == 1) {
          final long r = mN / d.longValue();
          final long s = d.longValue() - r;
          if ((Math.max(r * r - s * s, 2 * r * s) & 1) == 0) {
            mA.add(Z.valueOf(mN));
          }
        }
      }
    }
    return mA.pollFirst();
  }
}

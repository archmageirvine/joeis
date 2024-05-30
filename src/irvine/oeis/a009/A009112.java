package irvine.oeis.a009;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A009112 Areas of Pythagorean triangles: numbers which can be the area of a right triangle with integer sides.
 * @author Sean A. Irvine
 */
public class A009112 extends Sequence1 {

  private long mN = 4;

  private long[] d(final Z[] zd) {
    final long[] d = new long[zd.length];
    for (int k = 0; k < zd.length; ++k) {
      d[k] = zd[k].longValue();
    }
    return d;
  }

  @Override
  public Z next() {
    while (true) {
      final long[] d = d(Jaguar.factor(2 * ++mN).divisors());
      for (int k = 0; k <= d.length / 2; ++k) {
        final long t2 = d[k] * d[k] + d[d.length - k - 1] * d[d.length - k - 1];
        final long t = Functions.SQRT.l(t2);
        if (t * t == t2) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

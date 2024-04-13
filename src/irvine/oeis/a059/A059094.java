package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059094 Numbers whose sum of digits is a cube.
 * @author Sean A. Irvine
 */
public class A059094 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long v = ++mN;
      final long d = Functions.DIGIT_SUM.l(v);
      final long r = Z.valueOf(d).root(3).longValue();
      if (r * r * r == d) {
        return Z.valueOf(mN);
      }
    }
  }
}

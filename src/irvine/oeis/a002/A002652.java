package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002652 Theta series of Kleinian lattice Z[(1 + sqrt(-7))/ 2] in 1 complex (or 2 real) dimensions.
 * @author Sean A. Irvine
 */
public class A002652 extends Sequence0 {

  private long mN = -1;

  private long isSquare(final long n) {
    final long s = Functions.SQRT.l(n);
    return s * s == n ? 2 : 0;
  }

  @Override
  public Z next() {
    if (++mN < 1) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (long y = 1; y <= Functions.SQRT.l(4 * mN / 7); ++y) {
      final long t = 4 * mN - 7 * y * y;
      s = s.add(isSquare(t));
      if (t == 0) {
        s = s.subtract(1);
      }
    }
    s = s.multiply2();
    return s.add(isSquare(mN));
  }
}

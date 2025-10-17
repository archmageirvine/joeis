package irvine.oeis.a274;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A274923 List of y-coordinates of point moving in counterclockwise square spiral.
 * @author Sean A. Irvine
 */
public class A274923 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final long m = Functions.SQRT.l(mN);
    final long k = (m + 1) / 2;
    final long n = mN - 4 * k * k;
    if (n < 0) {
      if (n < -m) {
        return Z.valueOf(3 * k + n);
      } else {
        return Z.valueOf(k);
      }
    }
    if (n < m) {
      return Z.valueOf(k - n);
    }
    return Z.valueOf(-k);
  }
}

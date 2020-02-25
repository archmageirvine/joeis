package irvine.oeis.a028;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028964 Numbers represented by quadratic form with Gram matrix <code>[ 2, 1, 1; 1, 4, 2; 1, 2, 4 ]</code>, divided by 2.
 * @author Sean A. Irvine
 */
public class A028964 implements Sequence {

  // A:=matrix([[2,1,1],[1,4,2],[1,2,4]]);
  // simplify(norm(expand(multiply(multiply(matrix([[x,y,z]]),A),matrix([[x],[y],[z]])))));

  private long mN = -1;

  private boolean isRepresentable(final long n) {
    final long lim = LongUtils.sqrt(n);
    for (long z = -lim; z <= lim; ++z) {
      final long a = 2 * z * z;
      for (long y = -lim; y <= lim; ++y) {
        final long b = a + 2 * y * y + 2 * y * z;
        for (long x = -lim; x <= lim; ++x) {
          if (b + x * x + x * y + x * z == n) {
            return true;
          }
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (isRepresentable(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

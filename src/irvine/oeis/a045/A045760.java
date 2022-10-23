package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A045760 Smallest Maris-McGwire k-tuple (k&gt;1) for each k: f(n) = f(n+1) = ... = f(n+k-1), where f is defined in comments.
 * @author Sean A. Irvine
 */
public class A045760 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long k = 6;
    while (true) {
      final long s0 = A045759.f(++k);
      boolean ok = true;
      for (long j = 1; j < mN; ++j) {
        if (A045759.f(k + j) != s0) {
          ok = false;
          break;
        }
      }
      if (ok && A045759.f(k + mN) != s0) {
        return Z.valueOf(k);
      }
    }
  }
}

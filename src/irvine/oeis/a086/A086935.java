package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086935 a(n) is the smallest square such that n occurs in its decimal representation.
 * @author Sean A. Irvine
 */
public class A086935 extends Sequence0 {

  private long mMod = 10;
  private long mN = -1;

  private boolean is(final long n, long t) {
    do {
      if (t % mMod == n) {
        return true;
      }
      t /= 10;
    } while (t != 0);
    return false;
  }

  @Override
  public Z next() {
    if (++mN == mMod) {
      mMod *= 10;
    }
    long m = -1;
    while (true) {
      final long t = ++m * m;
      if (is(mN, t)) {
        return Z.valueOf(t);
      }
    }
  }
}


package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059848 As a square table by antidiagonals, the n-digit number which in base k starts 1010101...
 * @author Sean A. Irvine
 */
public class A059848 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  private Z t(final long n, final long m) {
    if (m == 0) {
      return Z.valueOf(n & 1);
    }
    final Z k = Z.valueOf(m);
    final Z d = k.square().subtract(1);
    if (d.isZero()) {
      return Z.valueOf((n + 1) / 2);
    }
    return k.pow(n + 1).divide(d);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}


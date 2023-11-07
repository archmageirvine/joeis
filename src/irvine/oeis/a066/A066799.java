package irvine.oeis.a066;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066799 Square array read by antidiagonals of eventual period of powers of k mod n; period of repeating digits of 1/n in base k.
 * @author Sean A. Irvine
 */
public class A066799 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private Z t(final long n, final long k) {
    final long p = LongUtils.modPow(k, n, n);
    long m = n;
    while (true) {
      if (LongUtils.modPow(k, ++m, n) == p) {
        return Z.valueOf(m - n);
      }
    }
  }

  @Override
  public Z next() {
    if (--mM < 1) {
      mM = ++mN;
    }
    return t(mN - mM + 1, mM);
  }
}


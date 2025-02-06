package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075029 Smallest initial number k of n consecutive numbers satisfying numdiv(k) &gt; numdiv(k+1) &gt; ... &gt; numdiv(k+n-1).
 * @author Sean A. Irvine
 */
public class A075029 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;

  private boolean is(final long k, final long n) {
    Z s = Functions.SIGMA0.z(k);
    for (long j = 1; j < n; ++j) {
      final Z t = Functions.SIGMA0.z(k + j);
      if (t.compareTo(s) >= 0) {
        return false;
      }
      s = t;
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (is(mM, mN)) {
        return Z.valueOf(mM);
      }
      ++mM;
    }
  }
}


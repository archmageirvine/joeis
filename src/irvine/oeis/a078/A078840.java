package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;

/**
 * A078840 Table of n-almost-primes T(n,k) (n &gt;= 0, k &gt; 0), read by antidiagonals, starting at T(0,1)=1 followed by T(1,1)=2.
 * @author Sean A. Irvine
 */
public class A078840 extends Sequence0 {

  private final DynamicLongArray mA = new DynamicLongArray();
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (mN == -1) {
      ++mN;
      return Z.ONE;
    }
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    long t = mA.get(mM);
    while (true) {
      final long omega = Functions.BIG_OMEGA.l(++t);
      if (omega == mM + 1) {
        mA.set(mM, t);
        return Z.valueOf(t);
      }
    }
  }
}

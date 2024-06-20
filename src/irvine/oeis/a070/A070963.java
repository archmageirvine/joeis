package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicArray;

/**
 * A070963 a(1) = 2; for n &gt;= 2, n = Sum_{1&lt;=k&lt;n, gcd(k,n)=1} a(k).
 * @author Sean A. Irvine
 */
public class A070963 extends Sequence1 {

  private final LongDynamicArray<Z> mA = new LongDynamicArray<>();
  private int mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    if (mA.get(1) == null) {
      mA.set(1, Z.TWO);
      return Z.TWO;
    }
    ++mN;
    while (mA.get(mN) == null) {
      long t = ++mM;
      for (long k = 1; k < mM; ++k) {
        if (Functions.GCD.l(mM, k) == 1) {
          final Z v = mA.get(k);
          if (v != null) {
            t -= v.longValueExact();
          } else {
            mA.set(k, Z.valueOf(t));
            break;
          }
        }
      }
    }
    return mA.get(mN);
  }
}

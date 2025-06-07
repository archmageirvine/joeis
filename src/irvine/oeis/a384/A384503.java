package irvine.oeis.a384;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A384503 Lexicographically earliest infinite sequence of distinct positive integers having the property that for any pair a(n-2) = i, a(n-1) = j of consecutive terms &gt; 1, a(n) is the smallest novel k such that gcd(i,k) &gt; 1 if gcd(i,j) = 1 or gcd(j,k) = 1 if gcd(i,j) &gt; 1.
 * @author Sean A. Irvine
 */
public class A384503 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.TWO;
      return Z.TWO;
    }
    if (mA.isOne()) {
      mA = mB;
      mB = Z.THREE;
      return Z.THREE;
    }
    final Z d = Functions.GCD.z(mA, mB);
    long k = 3;
    if (d.isOne()) {
      while (mUsed.isSet(++k) || Functions.GCD.z(mA, k).isOne()) {
        // do nothing
      }
    } else {
      while (mUsed.isSet(++k) || !Functions.GCD.z(mB, k).isOne()) {
        // do nothing
      }
    }
    mUsed.set(k);
    mA = mB;
    mB = Z.valueOf(k);
    return mB;
  }
}


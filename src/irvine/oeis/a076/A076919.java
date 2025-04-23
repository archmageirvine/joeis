package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076919 a(1) = 1, a(2) = 2, then a(n+1) is the smallest number such that the highest common factor of a(n) and a(n+1) is different from that of a(n) and a(n-1) and is more than 1.
 * @author Sean A. Irvine
 */
public class A076919 extends Sequence1 {

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
    final Z g = Functions.GCD.z(mA, mB);
    Z k = mB;
    while (true) {
      k = k.add(1);
      final Z d = Functions.GCD.z(k, mB);
      if (!Z.ONE.equals(d) && !g.equals(d)) {
        mA = mB;
        mB = k;
        return k;
      }
    }
  }
}


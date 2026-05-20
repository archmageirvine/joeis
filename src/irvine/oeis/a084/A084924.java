package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084924 Let t(x) be the highest power of 2 which divides x+1. Then a(1)=3; a(n) is the least prime p for which t(p) &gt; t(a(n-1)).
 * @author Sean A. Irvine
 */
public class A084924 extends Sequence1 {

  private Z mA = null;
  private long mShift = 2;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.THREE;
    } else {
      final Z add = Z.ONE.shiftLeft(mShift + 1);
      mA = add.subtract(1);
      while (!mA.isProbablePrime()) {
        mA = mA.add(add);
      }
    }
    mShift = Functions.VALUATION.l(mA.add(1), 2);
    return mA;
  }
}

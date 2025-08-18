package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079497 a(1)=1; for n &gt; 2, a(n) is the smallest integer &gt; a(n-1) such that frac(sqrt(5)*a(n)) &lt; frac(sqrt(5)*a(n-1)).
 * @author Sean A. Irvine
 */
public class A079497 extends Sequence1 {

  private static final long[] SMALL = {0, 1, 5, 9, 13};
  private Z mA = Z.NINE;
  private Z mB = Z.valueOf(13);
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN < SMALL.length) {
      return Z.valueOf(SMALL[(int) mN]);
    }
    final Z t = mB.multiply((mN & 3) == 2 ? 6 : 2).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }

  //  private static final CR SQRT5 = CR.FIVE.sqrt();
//  private Z mA = null;
//
//  @Override
//  public Z next() {
//    if (mA == null) {
//      mA = Z.ONE;
//    } else {
//      final CR t = SQRT5.multiply(mA).frac();
//      do {
//        mA = mA.add(1);
//      } while (SQRT5.multiply(mA).frac().compareTo(t) >= 0);
//    }
//    return mA;
//  }
}

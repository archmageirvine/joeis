package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a056.A056924;

/**
 * A061409 For each y &gt;= 1 there are only finitely many values of x &gt;= 1 such that x-y and x+y are both positive squares; list all such pairs (x,y) ordered by values of y; sequence gives x values.
 * @author Sean A. Irvine
 */
public class A061409 extends A056924 {

  private long mCount = super.next().longValue();
  private Z mN = Z.TWO;
  private Z mX = null;

  @Override
  public Z next() {
    if (--mCount < 0) {
      mN = mN.add(2);
      mCount = super.next().longValue() - 1;
      mX = mN;
    }
    while (true) {
      mX = mX.add(1);
      if (mX.add(mN).isSquare() && mX.subtract(mN).isSquare()) {
        return mX;
      }
    }
  }
}


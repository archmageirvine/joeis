package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a120.A120427;

/**
 * A060829 For each y &gt;= 1 there are only finitely many values of x &gt;= 1 such that x-y and x+y are both squares; list all such pairs (x,y) with gcd(x,y) = 1 ordered by values of y; sequence gives x values.
 * @author Sean A. Irvine
 */
public class A060829 extends A120427 {

  private Z mPrev = Z.ZERO;
  private Z mA = Z.ZERO;

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    final Z t = super.next();
    if (!t.equals(mPrev)) {
      mPrev = t;
      mA = t;
    }
    while (true) {
      mA = mA.add(1);
      if (Z.ONE.equals(mA.gcd(t)) && mA.subtract(t).isSquare() && mA.add(t).isSquare()) {
        return mA;
      }
    }
  }
}

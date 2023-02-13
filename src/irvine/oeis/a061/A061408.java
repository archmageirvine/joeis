package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a056.A056924;

/**
 * A061408 For each y &gt;= 1 there are only finitely many values of x &gt;= 1 such that x-y and x+y are both positive squares; list all such pairs (x,y) ordered by values of y; sequence gives y values.
 * @author Sean A. Irvine
 */
public class A061408 extends A056924 {

  private long mCount = super.next().longValue();
  private Z mN = Z.TWO;

  @Override
  public Z next() {
    if (--mCount < 0) {
      mN = mN.add(2);
      mCount = super.next().longValue() - 1;
    }
    return mN;
  }
}


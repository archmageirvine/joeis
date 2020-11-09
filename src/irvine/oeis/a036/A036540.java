package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036540 Numbers k such that d(i) is a power of 2 for all k &lt;= i &lt;= k+6, where d(i) = number of divisors of i.
 * @author Sean A. Irvine
 */
public class A036540 extends A036537 {

  private final Z[] mA = {null, super.next(), super.next(), super.next(), super.next(), super.next(), super.next()};

  @Override
  public Z next() {
    while (true) {
      System.arraycopy(mA, 1, mA, 0, mA.length - 1);
      mA[mA.length - 1] = super.next();
      if (mA[mA.length - 1].subtract(mA[0]).equals(Z.SIX)) {
        return mA[0];
      }
    }
  }
}

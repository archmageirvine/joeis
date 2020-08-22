package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026288 Number of (s(0), s(1), ..., s(n)) such that every s(i) is an integer, s(0) = 0, s(1) = 1, s(n) = 2, |s(i) - s(i-1)| &lt;= 1 for i &gt;= 2, |s(2) - s(1)| = 1, |s(3) - s(2)| = 1 if s(2) = 1. Also T(n,n-2), where T is the array in A026268.
 * @author Sean A. Irvine
 */
public class A026288 extends A026123 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    final Z t = mA;
    mA = super.next();
    return mA.add(t);
  }
}

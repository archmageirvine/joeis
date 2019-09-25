package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026288 Number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that every <code>s(i)</code> is an integer, <code>s(0) = 0, s(1) = 1, s(n) = 2, |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;= 2, |s(2) - s(1)| = 1, |s(3) - s(2)| = 1</code> if <code>s(2) = 1</code>. Also <code>T(n,n-2)</code>, where T is the array in <code>A026268</code>.
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

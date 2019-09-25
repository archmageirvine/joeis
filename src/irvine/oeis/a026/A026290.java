package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026290 <code>a(n) =</code> number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that every <code>s(i)</code> is an integer, <code>s(0) = 0, s(1) = 1, s(n) = 4, |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;=2, |s(2) - s(1)| = 1, |s(3) - s(2)| = 1</code> if <code>s(2) = 1</code>. Also <code>a(n) = T(n,n-4)</code>, where T is the array in <code>A026268</code>.
 * @author Sean A. Irvine
 */
public class A026290 extends A026125 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.add(t);
  }
}

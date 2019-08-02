package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a025.A025179;

/**
 * A024997 <code>a(n) =</code> number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that every <code>s(i)</code> is an integer, <code>s(0) = 0 = s(n), |s(i) - s(i-1)| = 1</code> for i <code>= 1,2; |s(i) - s(i-1)| &lt;= 1</code> for i <code>&gt;= 3</code>. Also <code>a(n) = T(n,n)</code>, where T is the array defined in <code>A024996</code>.
 * @author Sean A. Irvine
 */
public class A024997 extends A025179 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}

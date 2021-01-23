package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036706 a(n)=number of Gaussian integers z=a+bi satisfying n - 1/2 &lt; |z| &lt;= n + 1/2, a&gt;0, b&gt;=0.
 * @author Sean A. Irvine
 */
public class A036706 extends A036705 {

  @Override
  public Z next() {
    return super.next().divide(4);
  }
}


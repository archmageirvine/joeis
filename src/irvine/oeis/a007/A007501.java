package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007501 <code>a(0) = 2;</code> for <code>n &gt;= 0, a(n+1) = a(n)*(a(n)+1)/2</code>.
 * @author Sean A. Irvine
 */
public class A007501 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mA.multiply(mA.add(1)).divide2();
    return mA;
  }
}


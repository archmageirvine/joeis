package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064557 a(n) = # { p | A064553(k) = p prime and k &lt;= n}.
 * @author Sean A. Irvine
 */
public class A064557 extends A064553 {

  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if (super.next().isProbablePrime()) {
      mCount = mCount.add(1);
    }
    return mCount;
  }
}


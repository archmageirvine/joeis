package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A025147 Number of partitions of n into distinct parts <code>&gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A025147 extends A000009 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = super.next().subtract(mA);
    return mA;
  }
}

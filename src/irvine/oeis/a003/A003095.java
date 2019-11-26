package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003095 <code>a(n) = a(n-1)^2 + 1</code> for <code>n &gt;= 1</code>, with <code>a(0) = 0</code>.
 * @author Sean A. Irvine
 */
public class A003095 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : mA.square().add(1);
    return mA;
  }
}

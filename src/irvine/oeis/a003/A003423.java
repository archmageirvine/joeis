package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003423 <code>a(n) = a(n-1)^2 - 2</code>.
 * @author Sean A. Irvine
 */
public class A003423 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SIX : mA.square().subtract(2);
    return mA;
  }
}

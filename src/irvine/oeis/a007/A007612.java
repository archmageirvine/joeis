package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007612 a(n+1) = a(n) + digital root (A010888) of a(n).
 * @author Sean A. Irvine
 */
public class A007612 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(mA.mod(9));
    return mA;
  }
}

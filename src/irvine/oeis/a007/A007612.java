package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007612 a(n+1) = a(n) + digital root (A010888) of a(n).
 * @author Sean A. Irvine
 */
public class A007612 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(mA.mod(9));
    return mA;
  }
}

package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007018 a(n) = a(n-1)^2 + a(n-1), a(0)=1.
 * @author Sean A. Irvine
 */
public class A007018 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.square().add(mA);
    return mA;
  }
}


package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007051 a(n) = (3^n + 1)/2.
 * @author Sean A. Irvine
 */
public class A007051 implements Sequence {

  private Z mT = null;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply(3);
    return mT.add(1).divide2();
  }
}

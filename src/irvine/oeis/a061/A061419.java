package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061419 a(n) = ceiling(a(n-1)*3/2) with a(1) = 1.
 * @author Sean A. Irvine
 */
public class A061419 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(3).add(1).divide2();
    return mA;
  }
}


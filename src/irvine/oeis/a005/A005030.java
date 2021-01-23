package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005030 a(n) = 5*3^n.
 * @author Sean A. Irvine
 */
public class A005030 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : mA.multiply(3);
    return mA;
  }
}


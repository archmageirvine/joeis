package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000304 <code>a(n) = a(n-1)*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A000304 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    final Z t = mB == null ? Z.TWO : mA == null ? Z.THREE : mA.multiply(mB);
    mA = mB;
    mB = t;
    return t;
  }

}


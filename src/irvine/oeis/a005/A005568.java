package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A005568 Product of two successive Catalan numbers C(n)*C(n+1).
 * @author Sean A. Irvine
 */
public class A005568 extends A000108 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = super.next();
    final Z r = mA.multiply(t);
    mA = t;
    return r;
  }
}


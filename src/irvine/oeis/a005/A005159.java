package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A005159 a(n) = 3^n*Catalan(n).
 * @author Sean A. Irvine
 */
public class A005159 extends A000108 {

  private Z mThree = Z.ONE;

  @Override
  public Z next() {
    final Z res = super.next().multiply(mThree);
    mThree = mThree.multiply(3);
    return res;
  }
}


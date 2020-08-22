package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000378;

/**
 * A034043 Numbers that are imprimitively represented by x^2+y^2+z^2.
 * @author Sean A. Irvine
 */
public class A034043 extends A000378 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    while (true) {
      final Z n = super.next();
      if (!Cheetah.factor(n).isSquareFree()) {
        return n;
      }
    }
  }
}

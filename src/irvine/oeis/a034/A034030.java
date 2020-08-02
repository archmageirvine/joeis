package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a002.A002479;

/**
 * A034030 Imprimitively represented by <code>x^2+2y^2</code>.
 * @author Sean A. Irvine
 */
public class A034030 extends A002479 {

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

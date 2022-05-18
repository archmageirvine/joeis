package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002479;

/**
 * A034030 Imprimitively represented by x^2+2y^2.
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
      if (!Jaguar.factor(n).isSquareFree()) {
        return n;
      }
    }
  }
}

package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a001.A001481;

/**
 * A034023 Imprimitively represented by x^2+y^2.
 * @author Sean A. Irvine
 */
public class A034023 extends A001481 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (!Jaguar.factor(n).isSquareFree()) {
        return n;
      }
    }
  }
}

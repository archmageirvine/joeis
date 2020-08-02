package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000378;

/**
 * A034046 Numbers that are both primitively and imprimitively represented by <code>x^2+y^2+z^2</code>.
 * @author Sean A. Irvine
 */
public class A034046 extends A000378 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.mod(4) != 0 && !Cheetah.factor(n).isSquareFree()) {
        return n;
      }
    }
  }
}

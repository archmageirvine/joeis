package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A034021 Numbers that are primitively but not imprimitively represented by x^2+xy+y^2.
 * @author Sean A. Irvine
 */
public class A034021 extends A034017 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (Cheetah.factor(n).isSquareFree()) {
        return n;
      }
    }
  }
}

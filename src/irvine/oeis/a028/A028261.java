package irvine.oeis.a028;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a001.A001222;

/**
 * A028261 Numbers whose total number of prime factors (counting multiplicity) is squarefree.
 * @author Sean A. Irvine
 */
public class A028261 extends A001222 {

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(super.next()).isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}

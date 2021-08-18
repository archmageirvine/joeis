package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000422;

/**
 * A050687 A050677(n) is squarefree.
 * @author Sean A. Irvine
 */
public class A050687 extends A000422 {

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(super.next()).isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}

package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000422;

/**
 * A050688 Numbers k such that A000422(k) is nonsquarefree.
 * @author Sean A. Irvine
 */
public class A050688 extends A000422 {

  @Override
  public Z next() {
    while (true) {
      if (!Jaguar.factor(super.next()).isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}

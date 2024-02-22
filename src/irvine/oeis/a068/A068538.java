package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000042;

/**
 * A068538 Nonsquarefree repunits.
 * @author Sean A. Irvine
 */
public class A068538 extends A000042 {

  @Override
  public Z next() {
    while (true) {
      final Z rep = super.next();
      if (!Jaguar.factor(rep).isSquareFree()) {
        return rep;
      }
    }
  }
}

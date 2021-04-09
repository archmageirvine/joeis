package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000042;

/**
 * A046412 Lengths of nonsquarefree repunits.
 * @author Sean A. Irvine
 */
public class A046412 extends A000042 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z rep = super.next();
      if (!Jaguar.factor(rep).isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}

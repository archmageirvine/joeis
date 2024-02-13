package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066926.
 * @author Sean A. Irvine
 */
public class A068352 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      super.next();
      super.next();
      super.next();
      final Z p = super.next();
      if (Jaguar.factor(++mN).sigma0().multiply(mN).compareTo(p) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

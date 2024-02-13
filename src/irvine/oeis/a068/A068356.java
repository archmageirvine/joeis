package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066926.
 * @author Sean A. Irvine
 */
public class A068356 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long s0 = Jaguar.factor(super.next().add(1)).sigma0AsLong();
      if (Jaguar.factor(++mN).bigOmega() == s0) {
        return Z.valueOf(mN);
      }
    }
  }
}

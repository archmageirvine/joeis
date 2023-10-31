package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066617 Composites of form prime+1 containing a record number of prime factors.
 * @author Sean A. Irvine
 */
public class A066617 extends A000040 {

  private long mMax = 1;

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next().add(1);
      final long bigOmega = Jaguar.factor(c).bigOmega();
      if (bigOmega > mMax) {
        mMax = bigOmega;
        return c;
      }
    }
  }
}

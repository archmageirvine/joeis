package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066632 Composites of form prime-1 containing a record number of prime factors.
 * @author Sean A. Irvine
 */
public class A066632 extends A000040 {

  private long mMax = 1;

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next().subtract(1);
      final long bigOmega = Functions.BIG_OMEGA.l(c);
      if (bigOmega > mMax) {
        mMax = bigOmega;
        return c;
      }
    }
  }
}

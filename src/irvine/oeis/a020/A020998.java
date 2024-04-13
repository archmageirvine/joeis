package irvine.oeis.a020;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A020998 Numbers n such that the sum of the digits of Lucas(n) in base 12 is n.
 * @author Sean A. Irvine
 */
public class A020998 extends A000032 {

  private long mN = -1;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      if (Functions.DIGIT_SUM.l(12, super.next()) == ++mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

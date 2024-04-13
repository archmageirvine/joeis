package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000578;

/**
 * A067074 a(n) = smallest cube m^3 such that the sum of the digits of m^3 is equal to n^3.
 * @author Sean A. Irvine
 */
public class A067074 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long t = ++mN * mN * mN;
    final Sequence cubes = new A000578();
    while (true) {
      final Z c = cubes.next();
      if (Functions.DIGIT_SUM.l(c) == t) {
        return c;
      }
    }
  }
}

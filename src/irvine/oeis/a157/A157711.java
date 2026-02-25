package irvine.oeis.a157;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A157711 Primes made up of 0's and four 1's only.
 * @author Sean A. Irvine
 */
public class A157711 extends Sequence1 {

  private Z mA = Z.valueOf(15);

  @Override
  public Z next() {
    while (true) {
      mA = Functions.SWIZZLE.z(mA);
      final Z t = new Z(mA.toString(2));
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

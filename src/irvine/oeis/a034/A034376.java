package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034376 Cubes with all digits even.
 * @author Sean A. Irvine
 */
public class A034376 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z cube = mN.pow(3);
      if ((Functions.SYNDROME.i(cube) & 0b1010101010) == 0) {
        return cube;
      }
    }
  }
}

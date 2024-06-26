package irvine.oeis.a030;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030293 Cubes with at most two different digits.
 * @author Sean A. Irvine
 */
public class A030293 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z cube = mN.pow(3);
      if (Integer.bitCount(Functions.SYNDROME.i(cube)) <= 2) {
        return cube;
      }
    }
  }
}

package irvine.oeis.a030;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030294 Numbers k such that k^3 has at most three different digits.
 * @author Sean A. Irvine
 */
public class A030294 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z cube = mN.pow(3);
      if (Integer.bitCount(Functions.SYNDROME.i(cube)) <= 3) {
        return mN;
      }
    }
  }
}

package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061374 Numbers which have more different digits than their cubes.
 * @author Sean A. Irvine
 */
public class A061374 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (Long.bitCount(Functions.SYNDROME.i(mN)) > Long.bitCount(Functions.SYNDROME.i(n.pow(3)))) {
        return n;
      }
    }
  }
}


package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078118 n+1 does not divide sigma(n!).
 * @author Sean A. Irvine
 */
public class A078118 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(Functions.FACTORIAL.z(++mN)).mod(mN + 1) != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}


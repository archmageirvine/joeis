package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067064 Numbers n such that sigma(sigma(sigma(n))) == 0 (mod sigma(n)).
 * @author Sean A. Irvine
 */
public class A067064 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = Functions.SIGMA.z(++mN);
      if (Functions.SIGMA.z(Functions.SIGMA.z(sigma)).mod(sigma).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}


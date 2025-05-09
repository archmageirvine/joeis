package irvine.oeis.a383;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383360 Numbers k that have an i-th smallest divisor d_i(k) for which i*d_i(k) = k.
 * @author Sean A. Irvine
 */
public class A383360 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long k = 0;
      for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
        if (d.multiply(++k).equals(mN)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}


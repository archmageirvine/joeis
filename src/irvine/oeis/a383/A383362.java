package irvine.oeis.a383;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383362 a(n) is the number i for which i*d_i = A383360(n), where d_i is i-th smallest divisor d_i of A383360(n).
 * @author Sean A. Irvine
 */
public class A383362 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long k = 0;
      for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
        if (d.multiply(++k).equals(mN)) {
          return Z.valueOf(k);
        }
      }
    }
  }
}


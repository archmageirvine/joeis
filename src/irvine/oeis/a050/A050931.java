package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050931 Numbers having a prime factor congruent to 1 mod 6.
 * @author Sean A. Irvine
 */
public class A050931 extends Sequence1 {

  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      for (final Z p : Jaguar.factor(++mN).toZArray()) {
        if (p.mod(6) == 1) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

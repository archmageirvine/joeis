package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050931 Numbers having a prime factor congruent to 1 mod 6.
 * @author Sean A. Irvine
 */
public class A050931 implements Sequence {

  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      for (final Z p : Cheetah.factor(++mN).toZArray()) {
        if (p.mod(6) == 1) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

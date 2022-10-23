package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050700 Composite numbers n smaller than their decimal reverse but having the same number of prime factors.
 * @author Sean A. Irvine
 */
public class A050700 extends Sequence1 {

  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      if (++mN % 10 != 0) {
        final long bigOmega = Jaguar.factor(mN).bigOmega();
        if (bigOmega > 1) {
          final long rev = LongUtils.reverse(mN);
          if (rev > mN && Jaguar.factor(rev).bigOmega() == bigOmega) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}

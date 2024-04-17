package irvine.oeis.a050;

import irvine.math.function.Functions;
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
        final long bigOmega = Functions.BIG_OMEGA.l(mN);
        if (bigOmega > 1) {
          final long rev = Functions.REVERSE.l(mN);
          if (rev > mN && Functions.BIG_OMEGA.l(rev) == bigOmega) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}

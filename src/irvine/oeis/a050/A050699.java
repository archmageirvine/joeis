package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050699 Nonprime numbers n such that n and n-reversed (&lt;&gt; n and no leading zeros) have the same number of prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A050699 implements Sequence {

  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      if (++mN % 10 != 0) {
        final long bigOmega = Cheetah.factor(mN).bigOmega();
        if (bigOmega > 1) {
          final long rev = LongUtils.reverse(mN);
          if (rev != mN && Cheetah.factor(rev).bigOmega() == bigOmega) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}

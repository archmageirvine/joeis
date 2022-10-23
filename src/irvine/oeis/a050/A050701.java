package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050701 If composite k and its reverse are different and have same number of prime factors, then the larger of them is a term of the sequence.
 * @author Sean A. Irvine
 */
public class A050701 extends Sequence1 {

  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      if (++mN % 10 != 0) {
        final long bigOmega = Jaguar.factor(mN).bigOmega();
        if (bigOmega > 1) {
          final long rev = LongUtils.reverse(mN);
          if (rev < mN && Jaguar.factor(rev).bigOmega() == bigOmega) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}

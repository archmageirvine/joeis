package irvine.oeis.a050;

import irvine.math.function.Functions;
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
        final long bigOmega = Functions.BIG_OMEGA.l(mN);
        if (bigOmega > 1) {
          final long rev = Functions.REVERSE.l(mN);
          if (rev < mN && Functions.BIG_OMEGA.l(rev) == bigOmega) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}

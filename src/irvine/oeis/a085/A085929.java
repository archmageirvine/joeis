package irvine.oeis.a085;

import java.util.HashSet;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085929 Smaller of two consecutive numbers with the same prime signature not occurring earlier.
 * @author Sean A. Irvine
 */
public class A085929 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z s1 = FactorUtils.leastPrimeSignature(++mN);
      final Z s2 = FactorUtils.leastPrimeSignature(mN + 1);
      if (s1.equals(s2) && mSeen.add(s1)) {
        return Z.valueOf(mN);
      }
    }
  }
}

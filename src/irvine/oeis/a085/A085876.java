package irvine.oeis.a085;

import java.util.HashSet;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085876 Smallest k such that k and k+n have the same prime signature that is different from all previous terms.
 * @author Sean A. Irvine
 */
public class A085876 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      final Z sig = FactorUtils.leastPrimeSignature(++k);
      if (!mSeen.contains(sig) && sig.equals(FactorUtils.leastPrimeSignature(mN + k))) {
        mSeen.add(sig);
        return Z.valueOf(k);
      }
    }
  }
}

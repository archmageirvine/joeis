package irvine.oeis.a147;

import java.util.HashSet;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A147516 List giving least odd integer of each prime signature.
 * @author Sean A. Irvine
 */
public class A147516 extends Sequence1 {

  private final HashSet<Z> mSignatures = new HashSet<>();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z sig = FactorUtils.leastPrimeSignature(mN);
      if (mSignatures.add(sig)) {
        return Z.valueOf(mN);
      }
    }
  }
}

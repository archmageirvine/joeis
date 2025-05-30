package irvine.oeis.a077;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import irvine.factor.util.FactorUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077564.
 * @author Sean A. Irvine
 */
public class A077569 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private final Set<String> mSeen = new HashSet<>();

  @Override
  public Z next() {
    while (true) {
      if (++mM > 1L << (mN - 1)) {
        ++mN;
        mM = 1;
        mSeen.clear();
      }
      if (Functions.SIGMA0.l(mM) == mN && mSeen.add(Arrays.toString(FactorUtils.sortedPrimeSignature(Z.valueOf(mM))))) {
        return Z.valueOf(mM);
      }
    }
  }
}

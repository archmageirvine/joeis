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
public class A077570 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Set<String> seen = new HashSet<>();
    Z sum = Z.ZERO;
    for (long k = 1; k <= 1L << (mN - 1); ++k) {
      if (Functions.SIGMA0.l(k) == mN && seen.add(Arrays.toString(FactorUtils.sortedPrimeSignature(Z.valueOf(k))))) {
        sum = sum.add(k);
      }
    }
    return sum;
  }
}

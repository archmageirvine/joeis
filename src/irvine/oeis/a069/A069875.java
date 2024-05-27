package irvine.oeis.a069;

import java.util.Arrays;
import java.util.HashSet;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069875 Smallest multiple of n with a prime signature different from all previous terms.
 * @author Sean A. Irvine
 */
public class A069875 extends Sequence1 {

  private final HashSet<String> mSignatures = new HashSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z k = Z.ZERO;
    while (true) {
      k = k.add(mN);
      final int[] sig = FactorUtils.primeSignature(k);
      Arrays.sort(sig);
      if (mSignatures.add(Arrays.toString(sig))) {
        return k;
      }
    }
  }
}


package irvine.oeis.a056;

import java.util.HashSet;
import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056825 Numbers such that no smaller positive integer has the same maximal palindrome in the periodic part of the simple continued fraction for its square root.
 * @author Sean A. Irvine
 */
public class A056825 extends Sequence1 {

  private final HashSet<String> mSeen = new HashSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare()) {
        final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
        final String str = conv.subList(1, conv.size() - 1).toString();
        if (mSeen.add(str)) {
          return mN;
        }
      }
    }
  }
}

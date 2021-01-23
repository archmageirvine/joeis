package irvine.oeis.a010;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010335 Central term in continued fraction for sqrt(n) is [ sqrt(n) ].
 * @author Sean A. Irvine
 */
public class A010335 implements Sequence {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z[] s = mN.sqrtAndRemainder();
      if (!s[1].isZero()) {
        final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
        if (conv.get(conv.size() / 2).equals(s[0])) {
          return mN;
        }
      }
    }
  }
}

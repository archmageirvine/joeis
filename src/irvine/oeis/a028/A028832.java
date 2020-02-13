package irvine.oeis.a028;

import java.util.TreeSet;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028832.
 * @author Sean A. Irvine
 */
public class A028832 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final TreeSet<Z> seen = new TreeSet<>();
    if (!mN.isSquare()) {
      boolean first = true;
      for (final Z c : Convergents.continuedFractionConvergentsSqrt(mN.longValueExact())) {
        if (first) {
          first = false;
        } else {
          seen.add(c);
        }
      }
    }
    return Z.valueOf(seen.size());
  }
}

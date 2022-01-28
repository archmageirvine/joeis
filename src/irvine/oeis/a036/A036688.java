package irvine.oeis.a036;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A036688 Number of distinct n-digit suffixes of base-10 squares not containing the digit 0.
 * @author Sean A. Irvine
 */
public class A036688 implements Sequence {

  // Empirical, do not use to extend sequence

  private Z mMod = Z.ONE;

  @Override
  public Z next() {
    final Z min = mMod;
    final HashSet<Z> seen = new HashSet<>();
    mMod = mMod.multiply(10);
    final Z empiricalLimit = mMod.divide(4);
    for (Z k = Z.ONE; k.compareTo(empiricalLimit) <= 0; k = k.add(1)) {
      final Z res = k.modSquare(mMod);
      if (res.compareTo(min) >= 0 && ZUtils.digitCounts(res)[0] == 0) {
        seen.add(res);
      }
    }
    return Z.FIVE.max(Z.valueOf(seen.size()));
  }
}

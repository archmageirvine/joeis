package irvine.oeis.a038;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A038120 Number of distinct n-digit suffixes of base 6 squares not containing digit 0.
 * @author Sean A. Irvine
 */
public class A038120 implements Sequence {

  // Empirical, do not use to extend sequence

  private Z mMod = null;

  @Override
  public Z next() {
    if (mMod == null) {
      mMod = Z.ONE;
      return Z.ONE;
    }
    final Z min = mMod;
    final HashSet<Z> seen = new HashSet<>();
    mMod = mMod.multiply(6);
    final Z empiricalLimit = Z.TEN.max(mMod.divide(4));
    for (Z k = Z.ONE; k.compareTo(empiricalLimit) <= 0; k = k.add(1)) {
      final Z res = k.modSquare(mMod);
      if (res.compareTo(min) >= 0 && ZUtils.digitCounts(res, 6)[0] == 0) {
        seen.add(res);
      }
    }
    return Z.valueOf(seen.size());
  }
}

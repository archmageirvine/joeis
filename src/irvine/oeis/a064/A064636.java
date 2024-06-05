package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a008.A008290;

/**
 * A064636 Number of derangements up to cyclic rotations; permutation siteswap necklaces, with no fixed points (no "zero-throws", i.e., empty hands, if we use the mapping Perm2SiteSwap1 of A060495 and A060498).
 * @author Sean A. Irvine
 */
public class A064636 extends A008290 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ZERO;
    }
    return Integers.SINGLETON.sumdiv(mN,
      d -> Functions.PHI.z(mN / d)
        .multiply(Integers.SINGLETON.sum(0, d,
          k -> Z.valueOf(mN / d).pow(d - k).multiply(Z.valueOf(mN / d - 1).pow(k)).multiply(get((long) d, (long) k)))
        )
    ).divide(mN);
  }
}

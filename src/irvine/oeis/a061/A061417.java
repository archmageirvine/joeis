package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061417 Number of permutations up to cyclic rotations; permutation siteswap necklaces.
 * @author Sean A. Irvine
 */
public class A061417 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> {
      final Z t = Z.valueOf(mN / d);
      return Functions.PHI.z(t).multiply(t.pow(d)).multiply(Functions.FACTORIAL.z(d));
    }).divide(mN);
  }
}


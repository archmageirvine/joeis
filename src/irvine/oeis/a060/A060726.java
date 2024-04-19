package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060726 For n &gt;= 1, a(n) is the number of permutations in the symmetric group S_n such that their cycle decomposition contains no 6-cycle.
 * @author Sean A. Irvine
 */
public class A060726 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z r = Z.ZERO;
    Z u = Z.ONE;
    for (int k = 0; k <= mN / 6; ++k) {
      final Z t = Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(k)).divide(u);
      r = r.signedAdd((k & 1) == 0, t);
      u = u.multiply(6);
    }
    return r;
  }

}


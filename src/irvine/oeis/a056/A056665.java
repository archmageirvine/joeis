package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056665 Number of equivalence classes of n-valued Post functions of 1 variable under action of complementing group C(1,n).
 * @author Sean A. Irvine
 */
public class A056665 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> {
      return Z.valueOf(mN).pow(mN / d).multiply(Functions.PHI.l((long) d));
    }).divide(mN);
  }
}

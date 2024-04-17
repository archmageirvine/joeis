package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067712 Numbers n such that sum of exponents in prime factorization of n is &gt; log(n).
 * @author Sean A. Irvine
 */
public class A067712 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (CR.valueOf(Functions.BIG_OMEGA.l(++mN)).compareTo(CR.valueOf(mN).log()) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071834 Numbers n &gt; 1 such that n and sigma(n) have the same largest prime factor.
 * @author Sean A. Irvine
 */
public class A071834 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      if (Functions.GPF.l(++mN) == Functions.GPF.l(Functions.SIGMA.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}

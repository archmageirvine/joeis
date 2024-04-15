package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062957 C(n^2)-C(n), where C(n) is Chowla's function (A048050).
 * @author Sean A. Irvine
 */
public class A062957 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.SIGMA.z(++mN * mN).subtract(Functions.SIGMA.z(mN)).subtract(mN * mN - mN);
  }
}


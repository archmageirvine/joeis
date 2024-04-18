package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054619 Triangle T(n,k) = Sum_{d|k} phi(d)*n^(k/d).
 * @author Sean A. Irvine
 */
public class A054619 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Integers.SINGLETON.sumdiv(mM, d -> {
      return Functions.PHI.z(Z.valueOf(d)).multiply(Z.valueOf(mN).pow(mM / d));
    });
  }
}

package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086934 E.g.f.: (sqrt(Pi)/2)*erf(log(1-x)).
 * @author Sean A. Irvine
 */
public class A086934 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, (++mN - 1) / 2, k -> Z.NEG_ONE.pow(mN - k).multiply(Functions.STIRLING1.z(mN, 2 * k + 1)).multiply(Functions.FACTORIAL.z(2 * k).divide(Functions.FACTORIAL.z(k))));
  }
}


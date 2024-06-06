package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070229 Next m&gt;n such that m is divisible by lpf(n), lpf=A006530 largest prime factor.
 * @author Sean A. Irvine
 */
public class A070229 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long gpf = Functions.GPF.l(++mN);
    return Z.valueOf(mN / gpf + 1).multiply(gpf);
  }
}


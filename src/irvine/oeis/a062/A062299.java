package irvine.oeis.a062;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062299 a(n) = floor(cot(Pi/(n+1))).
 * @author Sean A. Irvine
 */
public class A062299 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    return ++mN <= 2 ? Z.ZERO : ComputableReals.SINGLETON.cot(CR.PI.divide(CR.valueOf(mN))).floor();
  }
}


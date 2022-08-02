package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058268 An approximation to sigma_{1/2}(n): ceiling( sum_{d|n} sqrt(d) ).
 * @author Sean A. Irvine
 */
public class A058268 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    CR sum = CR.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(CR.valueOf(d).sqrt());
    }
    return sum.ceil();
  }
}

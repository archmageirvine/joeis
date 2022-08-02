package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058272 An approximation to sigma_{5/2}(n): floor( sum_{d|n} d^(5/2) ).
 * @author Sean A. Irvine
 */
public class A058272 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    CR sum = CR.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(CR.valueOf(d.pow(5)).sqrt());
    }
    return sum.floor();
  }
}

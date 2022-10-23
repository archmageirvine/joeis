package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058270 An approximation to sigma_{3/2}(n): round( sum_{d|n} d^(3/2) ).
 * @author Sean A. Irvine
 */
public class A058270 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    CR sum = CR.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(CR.valueOf(d.pow(3)).sqrt());
    }
    return sum.round();
  }
}

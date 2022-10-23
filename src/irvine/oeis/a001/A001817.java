package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001817 G.f.: Sum_{n&gt;0} x^n/(1-x^(3n)) = Sum_{n&gt;=0} x^(3n+1)/(1-x^(3n+1)).
 * @author Sean A. Irvine
 */
public class A001817 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long r = 0;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (d.mod(3) == 1) {
        ++r;
      }
    }
    return Z.valueOf(r);
  }
}

package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001822 Expansion of Sum x^(3n+2)/(1-x^(3n+2)), n=0..inf.
 * @author Sean A. Irvine
 */
public class A001822 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long r = 0;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (d.mod(3) == 2) {
        ++r;
      }
    }
    return Z.valueOf(r);
  }
}

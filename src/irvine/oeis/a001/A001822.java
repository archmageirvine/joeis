package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001822 Expansion of Sum <code>x^(3n+2)/(1-x^(3n+2)), n=0.</code>.inf.
 * @author Sean A. Irvine
 */
public class A001822 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long r = 0;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      if (d.mod(3) == 2) {
        ++r;
      }
    }
    return Z.valueOf(r);
  }
}

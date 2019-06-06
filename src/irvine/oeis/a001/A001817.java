package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001817 G.f.: <code>Sum_{n&gt;0} x^n/(1-x^(3n)) = Sum_{n&gt;=0} x^(3n+1)/(1-x^(3n+1))</code>.
 * @author Sean A. Irvine
 */
public class A001817 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long r = 0;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      if (d.mod(3) == 1) {
        ++r;
      }
    }
    return Z.valueOf(r);
  }
}

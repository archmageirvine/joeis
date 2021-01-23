package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001842 Expansion of Sum_{n&gt;=0} x^(4*n+3)/(1 - x^(4*n+3)).
 * @author Sean A. Irvine
 */
public class A001842 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long c = 0;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      if ((d.longValue() & 3) == 3) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

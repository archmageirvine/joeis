package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063692.
 * @author Sean A. Irvine
 */
public class A063743 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (LongUtils.gcd(Jaguar.factor(++mN).bigOmega(), mN) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}


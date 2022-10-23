package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002175 Excess of number of divisors of 12n+1 of form 4k+1 over those of form 4k+3.
 * @author Sean A. Irvine
 */
public class A002175 extends Sequence0 {

  private long mN = -11;

  @Override
  public Z next() {
    long s = 0;
    mN += 12;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      final long dd = d.longValue() & 3;
      if (dd == 1) {
        ++s;
      } else if (dd == 3) {
        --s;
      }
    }
    return Z.valueOf(s);
  }
}

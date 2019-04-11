package irvine.oeis.a002;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002175 Excess of number of divisors of <code>12n+1</code> of form 4k+1 over those of form 4k+3.
 * @author Sean A. Irvine
 */
public class A002175 implements Sequence {

  private long mN = -11;

  @Override
  public Z next() {
    long s = 0;
    mN += 12;
    for (final Z d : Cheetah.factor(mN).divisors()) {
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

package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068092.
 * @author Sean A. Irvine
 */
public class A068101 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long sum = 0;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      final long dd = d.longValue();
      if (dd * dd <= mN) {
        sum += Mobius.mobius(dd);
      }
    }
    return Z.valueOf(sum);
  }
}


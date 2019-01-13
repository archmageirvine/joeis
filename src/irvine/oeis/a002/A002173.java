package irvine.oeis.a002;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002173.
 * @author Sean A. Irvine
 */
public class A002173 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      final long dd = d.longValue() & 3;
      if (dd == 1) {
        s = s.add(d.square());
      } else if (dd == 3) {
        s = s.subtract(d.square());
      }
    }
    return s;
  }
}

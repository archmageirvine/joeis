package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051594 Maximal elements of pairs of "(-1)sigma amicable numbers", sorted by their minimal elements.
 * @author Sean A. Irvine
 */
public class A051594 implements Sequence {

  private Z mN = Z.valueOf(429551);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z u = Jaguar.factor(mN).sigma(-1).subtract(mN);
      if (u.compareTo(mN) > 0) {
        final Z v = Jaguar.factor(u).sigma(-1).subtract(u);
        if (v.equals(mN)) {
          return u;
        }
      }
    }
  }
}


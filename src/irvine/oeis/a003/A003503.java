package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003503 The larger of a betrothed pair.
 * @author Sean A. Irvine
 */
public class A003503 implements Sequence {

  private Z mN = Z.valueOf(47);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = Jaguar.factor(mN).sigma().subtract(mN).subtract(1);
      if (s.compareTo(mN) > 0) {
        final Z t = Jaguar.factor(s).sigma().subtract(s).subtract(1);
        if (t.equals(mN)) {
          return s;
        }
      }
    }
  }
}


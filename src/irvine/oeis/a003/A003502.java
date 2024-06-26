package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003502 The smaller of a betrothed pair.
 * @author Sean A. Irvine
 */
public class A003502 extends Sequence1 {

  private Z mN = Z.valueOf(47);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = Functions.SIGMA1.z(mN).subtract(mN).subtract(1);
      if (s.compareTo(mN) > 0) {
        final Z t = Functions.SIGMA1.z(s).subtract(s).subtract(1);
        if (t.equals(mN)) {
          return mN;
        }
      }
    }
  }
}


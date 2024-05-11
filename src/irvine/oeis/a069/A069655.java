package irvine.oeis.a069;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069055.
 * @author Sean A. Irvine
 */
public class A069655 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Q t = new Q(++mN + 1, mN).pow(mN);
    Z max = Z.ZERO;
    while (true) {
      final Z c = t.toZ();
      if (c.compareTo(max) > 0) {
        max = c;
      }
      t = t.subtract(c);
      if (t.isZero()) {
        return max;
      }
      t = t.reciprocal();
    }
  }
}


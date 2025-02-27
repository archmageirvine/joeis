package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075576 Smaller of two consecutive squares with a prime sum.
 * @author Sean A. Irvine
 */
public class A075576 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z s = Z.valueOf(++mN).square();
      if (s.add(Z.valueOf(mN + 1).square()).isProbablePrime()) {
        return s;
      }
    }
  }
}


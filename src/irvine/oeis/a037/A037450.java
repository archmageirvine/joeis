package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A037450 Numbers which are one less than a perfect square that cannot otherwise be written as a power.
 * @author Sean A. Irvine
 */
public class A037450 extends Sequence0 {

  // After Michel Marcus

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z s = Z.valueOf(++mN).square();
      s.isPower();
      if (s.auxiliary() == 2) {
        return s.subtract(1);
      }
    }
  }
}

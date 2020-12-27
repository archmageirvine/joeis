package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037449.
 * @author Sean A. Irvine
 */
public class A037450 implements Sequence {

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

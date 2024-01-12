package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067886 Numbers k such that 2^k+1 and 2^k-1 have the same number of distinct prime factors.
 * @author Sean A. Irvine
 */
public class A067886 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.ONE.shiftLeft(++mN);
      if (Jaguar.factor(t.subtract(1)).omega() == Jaguar.factor(t.add(1)).omega()) {
        return Z.valueOf(mN);
      }
    }
  }
}

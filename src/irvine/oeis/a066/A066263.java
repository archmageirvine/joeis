package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066263 Numbers k such that 2^k + 1 has just two distinct prime factors.
 * @author Sean A. Irvine
 */
public class A066263 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(Z.ONE.shiftLeft(++mN).add(1)).omega() == 2) {
        return Z.valueOf(mN);
      }
    }
  }
}

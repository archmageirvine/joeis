package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037143 Numbers with at most 2 prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A037143 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).bigOmega() < 3) {
        return Z.valueOf(mN);
      }
    }
  }
}

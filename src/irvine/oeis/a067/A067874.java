package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067874 Positive integers x satisfying x^2 - D*y^2 = 1 for a unique integer D.
 * @author Sean A. Irvine
 */
public class A067874 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(Z.valueOf(++mN).square().subtract(1)).isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}

package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049532 Numbers k such that k^2 + 1 is not squarefree.
 * @author Sean A. Irvine
 */
public class A049532 extends Sequence1 {

  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      if (!Jaguar.factor(Z.valueOf(++mN).square().add(1)).isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}

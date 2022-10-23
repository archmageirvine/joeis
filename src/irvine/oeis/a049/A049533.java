package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049533 Numbers k such that k^2+1 is squarefree.
 * @author Sean A. Irvine
 */
public class A049533 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(Z.valueOf(++mN).square().add(1)).isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}

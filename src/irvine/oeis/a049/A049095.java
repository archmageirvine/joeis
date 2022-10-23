package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049095 Numbers k such that 2^k + 1 is squarefree.
 * @author Sean A. Irvine
 */
public class A049095 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(Z.ONE.shiftLeft(++mN).add(1)).isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}

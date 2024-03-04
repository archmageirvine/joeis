package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062837 Numbers k such that k, 2*k+1, 3*k+1 are all squarefree.
 * @author Sean A. Irvine
 */
public class A062837 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).isSquareFree() && Jaguar.factor(2 * mN + 1).isSquareFree() && Jaguar.factor(3 * mN + 1).isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}

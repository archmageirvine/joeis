package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068088 Numbers k such that k-3, k-2, k-1, k+1, k+2 and k+3 are squarefree.
 * @author Sean A. Irvine
 */
public class A068088 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Jaguar.factor(mN - 3).isSquareFree()
        && Jaguar.factor(mN - 2).isSquareFree()
        && Jaguar.factor(mN - 1).isSquareFree()
        && Jaguar.factor(mN + 1).isSquareFree()
        && Jaguar.factor(mN + 2).isSquareFree()
        && Jaguar.factor(mN + 3).isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}

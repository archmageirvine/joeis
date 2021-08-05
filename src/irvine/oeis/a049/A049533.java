package irvine.oeis.a049;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049533 Numbers k such that k^2+1 is squarefree.
 * @author Sean A. Irvine
 */
public class A049533 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(Z.valueOf(++mN).square().add(1)).isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}

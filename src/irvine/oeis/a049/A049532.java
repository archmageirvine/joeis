package irvine.oeis.a049;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049532 Numbers k such that k^2 + 1 is not squarefree.
 * @author Sean A. Irvine
 */
public class A049532 implements Sequence {

  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      if (!Cheetah.factor(Z.valueOf(++mN).square().add(1)).isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}

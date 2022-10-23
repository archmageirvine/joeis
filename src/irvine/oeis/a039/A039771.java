package irvine.oeis.a039;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039771 Numbers k such that phi(k) is a perfect cube.
 * @author Sean A. Irvine
 */
public class A039771 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z phi = Jaguar.factor(++mN).phi();
      phi.root(3);
      if (phi.auxiliary() == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}

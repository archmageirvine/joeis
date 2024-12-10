package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073597 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = -1;
    while (true) {
      if (CR.PI.multiply(Z.TEN.pow(++m)).frac().inverse().floor().equals(mN)) {
        return Z.valueOf(m + 1);
      }
    }
  }
}

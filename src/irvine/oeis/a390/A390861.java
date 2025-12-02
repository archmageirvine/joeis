package irvine.oeis.a390;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a179.A179454;

/**
 * A390861 allocated for Jiang Chenyang.
 * @author Sean A. Irvine
 */
public class A390861 extends Sequence1 {

  private final A179454 mA = new A179454();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.valueOf(mN);
    }
    return Integers.SINGLETON.sum(1, mN - 1, k -> mA.t(mN - 1, k).multiply(k + 1));
  }
}

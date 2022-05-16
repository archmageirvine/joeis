package irvine.oeis.a276;
// manually A080510/trionk

import irvine.math.z.Z;
import irvine.oeis.a080.A080510;

/**
 * A276961 Number of set partitions of [2n] with largest set of size n.
 * @author Georg Fischer
 */
public class A276961 extends A080510 {

  private int mN = -2;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.ONE;
    }
    return super.compute(2 * mN + 1, mN);
  }
}


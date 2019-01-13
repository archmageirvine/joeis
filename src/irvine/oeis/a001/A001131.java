package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A001131.
 * @author Sean A. Irvine
 */
public class A001131 extends MemorySequence {

  private int mN = -1;

  @Override
  protected Z computeNext() {
    switch (++mN) {
    case 0:
      return Z.ZERO;
    case 1:
      return Z.ONE;
    case 2:
      return Z.TWO;
    default:
      Z t = Z.ZERO;
      for (int m = (mN + 3) / 4; m <= mN / 2; ++m) {
        t = t.add(Binomial.binomial(2 * m, mN - 2 * m).multiply(get(m)));
      }
      return t;
    }
  }
}


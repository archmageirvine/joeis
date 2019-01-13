package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A003238.
 * @author Sean A. Irvine
 */
public class A003238 extends MemorySequence {

  {
    super.add(null);
  }

  @Override
  protected Z computeNext() {
    if (size() == 1) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (final Z d : Cheetah.factor(size() - 1).divisors()) {
      s = s.add(get(d.intValueExact()));
    }
    return s;
  }
}

package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A003238 Number of rooted trees with n vertices in which vertices at the same level have the same degree.
 * @author Sean A. Irvine
 */
public class A003238 extends MemorySequence {

  {
    setOffset(1);
    super.add(null);
  }

  @Override
  protected Z computeNext() {
    if (size() == 1) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (final Z d : Jaguar.factor(size() - 1).divisors()) {
      s = s.add(a(d.intValueExact()));
    }
    return s;
  }
}

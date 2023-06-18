package irvine.oeis.a064;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A064158.
 * @author Sean A. Irvine
 */
public class A064171 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    Q s = new Q(a(size() - 1));
    for (int k = size() - 2; k >= 0; --k) {
      s = s.reciprocal().add(a(k));
    }
    return s.num().multiply(s.den());
  }
}


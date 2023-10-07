package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.memory.MemorySequence;

/**
 * A066253 a(n) = A066249(A066249(n)).
 * @author Sean A. Irvine
 */
public class A066253 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A066249());
  private int mN = -1;

  @Override
  public Z next() {
    return mA.a(mA.a(++mN).intValueExact() - 1);
  }
}

package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.memory.MemorySequence;

/**
 * A066254 a(n) = A066250(A066250(n)).
 * @author Sean A. Irvine
 */
public class A066254 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A066250());
  private int mN = -1;

  @Override
  public Z next() {
    return mA.a(mA.a(++mN).intValueExact() - 1);
  }
}

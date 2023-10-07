package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.memory.MemorySequence;

/**
 * A066261 a(n) = A066260(A066260(n)).
 * @author Sean A. Irvine
 */
public class A066261 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A066260());
  private int mN = -1;

  @Override
  public Z next() {
    return mA.a(mA.a(++mN).intValueExact() - 1);
  }
}

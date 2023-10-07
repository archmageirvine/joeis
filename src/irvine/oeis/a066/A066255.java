package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.memory.MemorySequence;

/**
 * A066255 a(n) = A066251(A066251(n)).
 * @author Sean A. Irvine
 */
public class A066255 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A066251());
  private int mN = -1;

  @Override
  public Z next() {
    return mA.a(mA.a(++mN).intValueExact() - 1);
  }
}

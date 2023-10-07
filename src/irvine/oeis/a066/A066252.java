package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.memory.MemorySequence;

/**
 * A066252 a(n) = A066248(A066248(n)).
 * @author Sean A. Irvine
 */
public class A066252 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A066248());
  private int mN = -1;

  @Override
  public Z next() {
    return mA.a(mA.a(++mN).intValueExact() - 1);
  }
}

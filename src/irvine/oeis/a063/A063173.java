package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A063145.
 * @author Sean A. Irvine
 */
public class A063173 extends Sequence1 {

  private final MemorySequence mP = MemorySequence.cachedSequence(new A000040());
  private final MemorySequence mC = MemorySequence.cachedSequence(new A002808());
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(ZUtils.valuation(mC.a(mN - mM), mP.a(mM)));
  }
}

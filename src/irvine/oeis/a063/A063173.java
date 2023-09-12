package irvine.oeis.a063;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;
import irvine.oeis.memory.MemorySequence;

/**
 * A063173 Prime-composite array T(m,n): highest power of the n-th prime that divides the m-th composite, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A063173 extends Sequence1 {

  private final MemorySequence mC = MemorySequence.cachedSequence(new A002808());
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(ZUtils.valuation(mC.a(mN - mM), Puma.primeZ(mM + 1)));
  }
}

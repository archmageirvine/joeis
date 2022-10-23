package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000079;
import irvine.oeis.a000.A000142;
import irvine.oeis.a000.A000984;

/**
 * A059366 Triangle T(m,s), m &gt;= 0, 0 &lt;= s &lt;= m, arising in the computation of certain integrals.
 * @author Sean A. Irvine
 */
public class A059366 extends Sequence0 {

  private final MemorySequence mA0984 = MemorySequence.cachedSequence(new A000984());
  private final MemorySequence mA0142 = MemorySequence.cachedSequence(new A000142());
  private final MemorySequence mA0079 = MemorySequence.cachedSequence(new A000079());

  protected Z t(final int n, final int s) {
    return mA0984.a(s).multiply(mA0984.a(n - s)).multiply(mA0142.a(n)).divide(mA0079.a(n));
  }

  private int mN = -1;
  private int mS = 0;

  @Override
  public Z next() {
    if (++mS > mN) {
      ++mN;
      mS = 0;
    }
    return t(mN, mS);
  }
}


package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence0;
import irvine.oeis.a048.A048277;
import irvine.oeis.memory.MemorySequence;

/**
 * A064462 First row of Pascal's triangle that has n nonsquarefree entries, or -1 if no such row exists.
 * @author Sean A. Irvine
 */
public class A064462 extends Sequence0 implements Conjectural {

  private static final int HEURISTIC = 10;
  private final MemorySequence mA = MemorySequence.cachedSequence(new A048277());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (int k = 0; k <= HEURISTIC * mN; ++k) {
      if (mA.a(k).longValueExact() == mN) {
        return Z.valueOf(k);
      }
    }
    return Z.NEG_ONE;
  }
}

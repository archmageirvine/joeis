package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000203;
import irvine.oeis.memory.MemorySequence;

/**
 * A066435 Conjectured values for a(n) = least natural number k such that sigma(n+k) = sigma(n)+sigma(k) if it exists; otherwise 0.
 * @author Sean A. Irvine
 */
public class A066435 extends Sequence1 {

  private static final int HEURISTIC_MAX = 1000000;
  private int mN = 0;
  private final MemorySequence mSigma = MemorySequence.cachedSequence(new PrependSequence(new A000203(), 0));

  @Override
  public Z next() {
    final Z phi = mSigma.a(++mN);
    for (int k = 1; k < HEURISTIC_MAX; ++k) {
      if (phi.add(mSigma.a(k)).equals(mSigma.a(mN + k))) {
        return Z.valueOf(k);
      }
    }
    return Z.ZERO;
  }
}

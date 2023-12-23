package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001414;
import irvine.oeis.memory.MemorySequence;

/**
 * A067566 Smallest k such that k = n*A001414(k) (or 0 if no such k exists), where A001414(k) is the integer log of k, i.e., Sum p_i*e_i if the prime factorization of k is Product p_i^e_i.
 * @author Sean A. Irvine
 */
public class A067566 extends Sequence1 implements Conjectural {

  private static final int HEURISTIC_LIMIT = 10000;
  private final MemorySequence mS = MemorySequence.cachedSequence(new A001414());
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (int k = 1; k < mN * HEURISTIC_LIMIT; ++k) {
      if (mS.a(k - 1).multiply(mN).longValueExact() == k) {
        return Z.valueOf(k);
      }
    }
    return Z.ZERO;
  }
}


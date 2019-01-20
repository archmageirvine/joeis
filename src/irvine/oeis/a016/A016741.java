package irvine.oeis.a016;

import irvine.math.MemoryFunction3;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016741.
 * @author Sean A. Irvine
 */
public class A016741 implements Sequence {

  // todo not yet working

  // Player A to move
  private final MemoryFunction3<Integer, Boolean> mPlayerACache = new MemoryFunction3<Integer, Boolean>() {
    // True if B has a winning strategy starting from this position
    @Override
    protected Boolean compute(final Integer n, final Integer prevA, final Integer prevB) {
      if (n <= 1) {
        return Boolean.FALSE; // A can simply pick up remaining stone
      }
      final int limit = Math.min(n, 2 * prevB);
      if (n == limit && prevA != limit) {
        return Boolean.FALSE; // A can simply pick up all remaining stones
      }
      for (int k = 1; k <= limit; ++k) {
        if (k != prevA) {
          if (!mPlayerBCache.get(n - k, k, prevB)) {
            return Boolean.FALSE;
          }
        }
      }
      return Boolean.TRUE;
    }
  };

  // Player B to move
  private final MemoryFunction3<Integer, Boolean> mPlayerBCache = new MemoryFunction3<Integer, Boolean>() {
    // True if B has a winning strategy starting from this position
    @Override
    protected Boolean compute(final Integer n, final Integer prevA, final Integer prevB) {
      if (n <= 1) {
        return Boolean.TRUE; // B can simply pick up remaining stone
      }
      final int limit = Math.min(n, 2 * prevA);
      if (n == limit && prevB != limit) {
        return Boolean.TRUE; // B can simply pick up all remaining stones
      }
      for (int k = 1; k <= limit; ++k) {
        if (k != prevB) {
          if (mPlayerACache.get(n - k, prevA, k)) {
            return Boolean.TRUE;
          }
        }
      }
      return Boolean.FALSE;
    }
  };

  private int mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 2) {
        return Z.TWO; // special case, playerA cannot simply take 2 stones
      }
      if (mPlayerACache.get(mN, mN, mN)) {
        return Z.valueOf(mN);
      }
    }
  }

}


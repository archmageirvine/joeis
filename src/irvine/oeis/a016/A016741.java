package irvine.oeis.a016;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A016741 Initial pile sizes which guarantee a win for player 2 in a certain variant of Nim.
 * @author Sean A. Irvine
 */
public class A016741 extends Sequence1 {

  // Player A to move
  private final MemoryFunctionInt3<Boolean> mPlayerACache = new MemoryFunctionInt3<>() {
    // True if B has a winning strategy starting from this position
    @Override
    protected Boolean compute(final int n, final int prevA, final int prevB) {
      if (n <= 1) {
        return Boolean.FALSE; // A can simply pick up remaining stone
      }
      final int limit = Math.min(n, 2 * prevB);
      if (n == limit && prevA != limit) {
        return Boolean.FALSE; // A can simply pick up all remaining stones
      }
      for (int k = 1; k <= limit; ++k) {
        if (k != prevA && !mPlayerBCache.get(n - k, k, prevB)) {
          return Boolean.FALSE;
        }
      }
      return Boolean.TRUE;
    }
  };

  // Player B to move
  private final MemoryFunctionInt3<Boolean> mPlayerBCache = new MemoryFunctionInt3<>() {
    // True if B has a winning strategy starting from this position
    @Override
    protected Boolean compute(final int n, final int prevA, final int prevB) {
      if (n <= 1) {
        return Boolean.TRUE; // B can simply pick up remaining stone
      }
      final int limit = Math.min(n, 2 * prevA);
      if (n == limit && prevB != limit) {
        return Boolean.TRUE; // B can simply pick up all remaining stones
      }
      for (int k = 1; k <= limit; ++k) {
        if (k != prevB && mPlayerACache.get(n - k, prevA, k)) {
          return Boolean.TRUE;
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


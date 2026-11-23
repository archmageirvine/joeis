package irvine.oeis.a385;

import irvine.math.turing.Antihydra;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A385150 Smallest starting x which reaches the Antihydra halting condition for the first time at 3*n+1 terms of the iteration x -&gt; floor(3*x/2).
 * @author Gregory Morse
 */
public class A385150 extends Sequence0 {
  private static final int BATCH_LIMIT = 100;
  private static final int HORIZON = 3 * BATCH_LIMIT + 1;
  private static final int CACHE_OFFSET = 61;
  // Only minima above the default fast path's largest starting value (10^8).
  // AntihydraMinima regenerates these values without consulting this cache.
  private static final long[] CACHE = {
    402885124L, 0, 678502834L, 409982772L, 416667348L, 361249620L,
    0, 473464322L, 295338736L, 0, 0, 0,
    1471930850L, 692040658L, 307573626L, 1052549236L, 2212600222L, 6790784446L,
    9295798994L, 8204247950L, 2469698200L, 731762430L, 487841620L, 216818498L,
    2635201004L, 5446738820L, 21234956852L, 31249979514L, 56796759028L, 16828669342L,
    4986272398L, 22835730060L, 15223820040L, 2216121066L, 1477414044L, 984942696L,
    90155481692L, 175612931450L, 36197520360L, 84385696988L
  };
  private final long[] mMinima = new long[BATCH_LIMIT + 1];
  private final boolean mUseCache;
  private int mN = -1;
  private long mStart = 2;

  /** Construct the sequence. */
  public A385150() {
    this(true);
  }

  /**
   * Construct the sequence, optionally bypassing the verified slow-term cache.
   * @param useCache true to use the verified cache
   */
  public A385150(final boolean useCache) {
    mUseCache = useCache;
  }

  @Override
  public Z next() {
    final int steps = Math.addExact(Math.multiplyExact(3, ++mN), 1);
    if (steps == 1) {
      return Z.ONE;
    }
    final int k = mN - CACHE_OFFSET;
    if (mUseCache && k >= 0 && k < CACHE.length && CACHE[k] != 0) {
      return Z.valueOf(CACHE[k]);
    }
    if (mN <= BATCH_LIMIT) {
      // One increasing scan supplies the minima for every represented
      // halting time. No earlier start is revisited for the next term.
      while (mMinima[mN] == 0 && mStart > 0) {
        final int halt = Antihydra.haltingTime(mStart, HORIZON);
        if (halt > 0) {
          final int n = (halt - 1) / 3;
          if (mMinima[n] == 0) {
            mMinima[n] = mStart;
          }
        }
        mStart += 2;
      }
      if (mMinima[mN] != 0) {
        return Z.valueOf(mMinima[mN]);
      }
      throw new UnsupportedOperationException();
    }
    for (long start = 2; start > 0; start += 2) {
      if (Antihydra.haltingTime(start, steps) == steps) {
        return Z.valueOf(start);
      }
    }
    throw new UnsupportedOperationException();
  }
}

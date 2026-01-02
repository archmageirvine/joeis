package irvine.oeis.a391;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391538 Guaranteed win if opponent chooses one of three baskets and the player chooses the coins with values from 1 to n (see Comments for details).
 * @author Sean A. Irvine
 */
public class A391538 extends Sequence1 {

  // After Ruediger Jehn

  private final int mChests;
  private int mN = 0;

  protected A391538(final int chests) {
    mChests = chests;
  }

  /** Construct the sequence. */
  public A391538() {
    this(3);
  }

  private int next(final int[] chest, final int[] coins, final int pos, final int remaining) {
    if (pos == mN - 1) {
      return Functions.MAX.i(Functions.MIN.i(chest) + coins[pos], Functions.MAX.i(chest));
    }

    // If adding all the remaining coins to the smallest chest does not exceed the current
    // maximum, then we can never improve on the current maximum
    final int r = Functions.MIN.i(chest) + remaining;
    final int m = Functions.MAX.i(chest);
    if (r <= m) {
      return m;
    }
    int maxCoins = Integer.MAX_VALUE;
    for (int i = 0; i < chest.length; ++i) {
      int maxCoinsI = 0;
      final int c = coins[pos];
      // Used coins stored left of pos, unused >= pos
      for (int k = pos; k < coins.length; ++k) {
        final int j = coins[k];
        coins[k] = c;
        coins[pos] = j;
        chest[i] += j;
        maxCoinsI = Math.max(maxCoinsI, next(chest, coins, pos + 1, remaining - j));
        chest[i] -= j;
        coins[k] = j;
      }
      coins[pos] = c;
      maxCoins = Math.min(maxCoins, maxCoinsI);
    }
    return maxCoins;
  }

  @Override
  public Z next() {
    ++mN;
    final int[] chest = new int[mChests];
    final int[] coins = IntegerUtils.identity1(new int[mN]);
    return Z.valueOf(next(chest, coins, 0, mN * (mN + 1) / 2));
  }
}

package irvine.oeis.a013;

import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013560 Cardinality of the permutation (k, k-1, ..., 2, 1)(n, n-1, ..., k+1) in an exchange shuffle applied in all n^n possible ways to (1,2,...,n).
 * @author Sean A. Irvine
 */
public class A013560 extends Sequence1 {

  private int mN = 0;

  private int[] rho(final int n) {
    // Prepare rho_n permutation
    final int[] deck = new int[n];
    final int kp = (n + 1) / 2;
    for (int k = 0; k < kp; ++k) {
      deck[k] = (k + 1) % kp;
    }
    for (int k = kp; k < deck.length; ++k) {
      deck[k] = k + 1;
    }
    deck[deck.length - 1] = kp % mN;
    return deck;
  }

  protected boolean bump(final int[] p, final int n) {
    for (int k = 0; k < p.length; ++k) {
      if (++p[k] < n) {
        return true;
      }
      p[k] = 0;
    }
    return false;
  }

  @Override
  public Z next() {
    final int[] expected = rho(++mN);
    final int[] deck = new int[mN];
    final int[] p = new int[mN];
    long cnt = 0;
    do {
      // Apply Phi shuffle
      IntegerUtils.identity(deck);
      for (int k = 0; k < deck.length; ++k) {
        final int t = deck[p[k]];
        deck[p[k]] = deck[k];
        deck[k] = t;
      }
      if (Arrays.equals(deck, expected)) {
        ++cnt;
      }
    } while (bump(p, mN));
    return Z.valueOf(cnt);
  }
}

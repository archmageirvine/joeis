package irvine.oeis.a007;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A007709 Number of winning (or reformed) decks at Mousetrap.
 * @author Sean A. Irvine
 */
public class A007709 implements Sequence {

  // Brute force Mousetrap

  private int mN = 0;

  private boolean isWinning(final int[] p) {
    // 0-based rather than 1-based used in papers
    int nextFree = 0;
    int pos = 0;
    int count = -1;
    int discarded = 0;
    while (true) {
      if (++count >= p.length) {
        return false; // loss
      }
      if (p[pos] == count) {
        count = -1; // Restart the count
        if (++discarded == p.length) {
          return true; // win
        }
      } else {
        // Mismatch
        p[nextFree++] = p[pos];
        if (nextFree == p.length) {
          nextFree = 0;
        }
      }
      if (++pos == p.length) {
        pos = 0;
      }
    }
  }

  @Override
  public Z next() {
    long count = 0;
    final Permutation perm = new Permutation(++mN);
    int[] p;
    while ((p = perm.next()) != null) {
      if (isWinning(Arrays.copyOf(p, p.length))) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }

}

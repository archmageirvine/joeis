package irvine.oeis.a028;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A028306 Triangle read by rows of numbers of permutations eliminating just card k out of n in game of Mousetrap.
 * @author Sean A. Irvine
 */
public class A028306 implements Sequence {

  // Cf. A007710

  private int mN = 0;
  private int mM = -1;

  protected boolean isDiscardedCard(final int[] p, final int k) {
    // 0-based rather than 1-based used in papers
    int nextFree = 0;
    int pos = 0;
    int count = -1;
    int discarded = 0;
    boolean discardedK = false;
    while (true) {
      if (++count >= p.length) {
        return discardedK && discarded == 1;
      }
      if (p[pos] == count) {
        count = -1; // Restart the count
        if (pos == k) {
          discardedK = true;
        }
        if (++discarded > 1) {
          return false;
        }
        if (discarded == p.length) {
          return discardedK;
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
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    long count = 0;
    final Permutation perm = new Permutation(mN);
    int[] p;
    while ((p = perm.next()) != null) {
      if (isDiscardedCard(Arrays.copyOf(p, p.length), mM)) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}

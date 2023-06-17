package irvine.oeis.a007;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.Permutation;

/**
 * A007710 From the game of Mousetrap.
 * @author Sean A. Irvine
 */
public class A007710 extends AbstractSequence {

  /** Construct the sequence. */
  public A007710() {
    super(1);
  }

  // Brute force Mousetrap

  private int mN = 0;

  protected boolean isDiscardCount(final int[] p, final int dc) {
    // 0-based rather than 1-based used in papers
    int nextFree = 0;
    int pos = 0;
    int count = -1;
    int discarded = 0;
    while (true) {
      if (++count >= p.length) {
        return discarded == dc; // loss
      }
      if (p[pos] == count) {
        count = -1; // Restart the count
        if (++discarded > dc) {
          return false;
        }
        if (discarded == p.length) {
          return discarded == dc;
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
      if (isDiscardCount(Arrays.copyOf(p, p.length), 1)) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }

}

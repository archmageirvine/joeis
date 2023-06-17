package irvine.oeis.a007;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.Permutation;

/**
 * A007712 Number of once reformable permutations of {1, 2,...,n}.
 * @author Sean A. Irvine
 */
public class A007712 extends AbstractSequence {

  /* Construct the sequence. */
  public A007712() {
    super(2);
  }

  private int mN = 1;
  private Z mF = Z.ONE;

  // This is like A007709, but we return the reformed permutation
  protected int[] reform(final int[] p) {
    // 0-based rather than 1-based used in papers
    final int[] reform = new int[p.length];
    int nextFree = 0;
    int pos = 0;
    int count = -1;
    int discarded = 0;
    while (true) {
      if (++count >= p.length) {
        return null; // loss
      }
      if (p[pos] == count) {
        reform[discarded] = count;
        count = -1; // Restart the count
        if (++discarded == p.length) {
          return reform; // win
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
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    Z count = mF;
    final Permutation perm = new Permutation(mN);
    int[] p;
    while ((p = perm.next()) != null) {
      final int[] reform = reform(Arrays.copyOf(p, p.length));
      if (reform == null || reform(reform) != null) {
        count = count.subtract(1);
      }
    }
    return Z.ONE.max(count); // I don't know why a(2) != 0
  }

}

package irvine.oeis.a006;

import java.util.HashSet;

import irvine.util.Pair;

/**
 * A006395.
 * @author Sean A. Irvine
 */
public class A006395 extends A006385 {

  /** Construct the sequence. */
  public A006395() {
    next();
  }

  private final HashSet<Pair<Integer, Integer>> mSeen = new HashSet<>();

  @Override
  protected boolean rejectDecode(final int e, final int[] vert) {
    mSeen.clear();
    for (int k = 1; k <= e; ++k) {
      final int j = 2 * e + 1 - k;
      final int vk = vert[k];
      final int vj = vert[j];
      if (vk == vj) {
        return true; // loop
      }
      if (!mSeen.add(new Pair<>(Math.min(vk, vj), Math.max(vk, vj)))) {
        return true; // parallel
      }
    }
    return false;
  }
}

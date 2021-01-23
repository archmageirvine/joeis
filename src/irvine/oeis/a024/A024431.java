package irvine.oeis.a024;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024431 A generalized difference set on the set of all integers (lambda = 1).
 * @author Sean A. Irvine
 */
public class A024431 implements Sequence {

  // Generates a pair of elements at a time
  private final TreeSet<Z> mSet = new TreeSet<>();
  private final TreeSet<Z> mDiffs = new TreeSet<>();
  private Z mNext = null;
  private Z mJ = Z.TWO;

  @Override
  public Z next() {
    if (mNext != null) {
      final Z t = mNext;
      mNext = null;
      return t;
    } else if (mSet.isEmpty()) {
      mSet.add(Z.ONE);
      mSet.add(Z.TWO);
      mDiffs.add(Z.ONE);
      mNext = Z.TWO;
      return Z.ONE;
    } else {
      while (mDiffs.contains(mJ)) {
        mJ = mJ.add(1);
      }
      final Z a = mSet.last().multiply2().add(2);
      mNext = a.add(mJ);
      mDiffs.add(mJ);
      for (final Z t : mSet) {
        mDiffs.add(a.subtract(t));
        mDiffs.add(mNext.subtract(t));
      }
      mSet.add(a);
      mSet.add(mNext);
      return a;
    }
  }
}

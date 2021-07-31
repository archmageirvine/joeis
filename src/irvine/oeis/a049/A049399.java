package irvine.oeis.a049;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049399 A generalized difference set on the set of all integers (lambda = 2).
 * @author Sean A. Irvine
 */
public class A049399 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final TreeSet<Z> mDiffs = new TreeSet<>();
  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mNext = null;

  @Override
  public Z next() {
    if (mNext != null) {
      final Z t = mNext;
      mNext = null;
      return t;
    }
    if (mA.isEmpty()) {
      mA.add(Z.ONE);
      return Z.ONE;
    } else if (mA.size() == 1) {
      mA.add(Z.TWO);
      mDiffs.add(Z.ONE);
      return Z.TWO;
    } else {
      final Z k = mA.last();
      for (Z j = Z.ONE; true; j = j.add(1)) {
        if (!mForbidden.contains(j)) {
          final Z t = k.multiply2().add(2);
          // Update forbidden
          for (final Z x : mA) {
            final Z d = t.subtract(x);
            if (!mDiffs.add(d)) {
              mForbidden.add(d);
            }
          }
          mA.add(t);
          mNext = t.add(j);
          // Update forbidden
          for (final Z x : mA) {
            final Z d = mNext.subtract(x);
            if (!mDiffs.add(d)) {
              mForbidden.add(d);
            }
          }
          mA.add(mNext);
          return t;
        }
      }
    }
  }
}


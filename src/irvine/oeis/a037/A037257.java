package irvine.oeis.a037;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037257 a() = 1,3,... [ A037257 ], differences = 2,... [ A037258 ] and 2nd differences [ A037259 ] are disjoint and monotonic; adjoin next free number to 2nd differences unless it would produce a duplicate in which case ignore.
 * @author Sean A. Irvine
 */
public class A037257 implements Sequence {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private final List<Z> mA0 = new ArrayList<>();
  private final List<Z> mA1 = new ArrayList<>();
  private final List<Z> mA2 = new ArrayList<>();
  protected int mN = -1;

  private Z a0(final int n) {
    if (n == mA0.size()) {
      if (n == 0) {
        mSeen.add(Z.ONE);
        mA0.add(Z.ONE);
      } else {
        final Z t = mA0.get(n - 1).add(a1(n - 1));
        if (!mSeen.add(t)) {
          throw new RuntimeException("Adding " + t + " forbidden");
        }
        mA0.add(t);
      }
    }
    return mA0.get(n);
  }

  protected Z a1(final int n) {
    if (n == mA1.size()) {
      if (n == 0) {
        mSeen.add(Z.TWO);
        mA1.add(Z.TWO);
      } else {
        final Z t = mA1.get(n - 1).add(a2(n - 1));
        if (!mSeen.add(t)) {
          throw new RuntimeException("Adding " + t + " forbidden");
        }
        mA1.add(t);
      }
    }
    return mA1.get(n);
  }

  protected Z a2(final int n) {
    if (n == mA2.size()) {
      if (n == 0) {
        mSeen.add(Z.FOUR);
        mA2.add(Z.FOUR);
      } else {
        Z t = mA2.get(n - 1);
        do {
          t = t.add(1);
        } while (mSeen.contains(t) || mSeen.contains(t.add(a1(n))));
        mSeen.add(t);
        mA2.add(t);
      }
    }
    return mA2.get(n);
  }

  @Override
  public Z next() {
    return a0(++mN);
  }
}


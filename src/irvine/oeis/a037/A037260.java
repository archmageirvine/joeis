package irvine.oeis.a037;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A037260 a()=A037260 and its first [ A037261 ], 2nd [ A037262 ] and 3rd [ A037263 ] differences together include every number at most once and are monotonic and minimal.
 * @author Sean A. Irvine
 */
public class A037260 extends Sequence0 {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private final List<Z> mA0 = new ArrayList<>();
  private final List<Z> mA1 = new ArrayList<>();
  private final List<Z> mA2 = new ArrayList<>();
  private final List<Z> mA3 = new ArrayList<>();
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
        final Z t = mA2.get(n - 1).add(a3(n - 1));
        if (!mSeen.add(t)) {
          throw new RuntimeException("Adding " + t + " forbidden");
        }
        mA2.add(t);
      }
    }
    return mA2.get(n);
  }

  protected Z a3(final int n) {
    if (n == mA3.size()) {
      if (n == 0) {
        mSeen.add(Z.SEVEN);
        mA3.add(Z.SEVEN);
      } else {
        Z t = mA3.get(n - 1);
        do {
          t = t.add(1);
        } while (mSeen.contains(t) || mSeen.contains(t.add(a2(n))));
        mSeen.add(t);
        mA3.add(t);
      }
    }
    return mA3.get(n);
  }

  @Override
  public Z next() {
    return a0(++mN);
  }
}


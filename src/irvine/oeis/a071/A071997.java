package irvine.oeis.a071;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071115.
 * @author Sean A. Irvine
 */
public class A071997 extends Sequence1 {

  private final List<Set<Z>> mA = new ArrayList<>();
  private Z mMex = Z.ONE;

  private boolean contains(final Z n) {
    for (final Set<Z> s : mA) {
      if (s.contains(n)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Collections.singleton(Z.TWO));
    } else {
      final Set<Z> s = new HashSet<>();
      for (int k = 0; 2 * k < mA.size(); ++k) {
        for (final Z a : mA.get(k)) {
          for (final Z b : mA.get(mA.size() - 1 - k)) {
            final Z t1 = a.add(b);
            if (!contains(t1)) {
              s.add(t1);
            }
            final Z t2 = a.multiply(b);
            if (!contains(t2)) {
              s.add(t2);
            }
            final Z t3 = a.subtract(b);
            if (!contains(t3)) {
              s.add(t3);
            }
            final Z t4 = b.subtract(a);
            if (!contains(t4)) {
              s.add(t4);
            }
            if (!a.isZero() && b.mod(a).isZero()) {
              final Z t5 = b.divide(a);
              if (!contains(t5)) {
                s.add(t5);
              }
            }
            if (!b.isZero() && a.mod(b).isZero()) {
              final Z t6 = a.divide(b);
              if (!contains(t6)) {
                s.add(t6);
              }
            }
          }
        }
      }
      mA.add(s);
    }
    while (contains(mMex)) {
      mMex = mMex.add(1);
    }
    return mMex;
  }
}

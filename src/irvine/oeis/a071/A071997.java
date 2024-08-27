package irvine.oeis.a071;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071997 a(n) is the smallest positive integer that cannot be obtained by using the number 2 at most n times and the operators +, -, *, /.
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

  private void update(final Set<Z> s, final Z v) {
    if (v.compareTo(mMex) >= 0 && !contains(v)) {
      s.add(v);
    }
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
            update(s, a.add(b));
            update(s, a.multiply(b));
            update(s, a.subtract(b));
            update(s, b.subtract(a));
            if (!a.isZero() && b.mod(a).isZero()) {
              update(s, b.divide(a));
            }
            if (!b.isZero() && a.mod(b).isZero()) {
              update(s, a.divide(b));
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

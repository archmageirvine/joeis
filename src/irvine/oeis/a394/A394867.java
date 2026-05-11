package irvine.oeis.a394;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394867 allocated for Zhao Hui Du.
 * @author Sean A. Irvine
 */
public class A394867 extends Sequence1 {

  // Ported from Python at https://www.zhihu.com/question/2022768758284977764/answer/2023409666521145643

  private int mN = 0;
  private final ArrayList<Z> mFx = new ArrayList<>();

  private Z f(final Z x) {
    Z t = x;
    if (t.isZero()) {
      return Z.ZERO;
    }
    Z s = Z.ZERO;
    while (!t.isZero()) {
      final Z[] qr = t.divideAndRemainder(Z.TEN);
      s = s.add(qr[1].pow(mN));
      t = qr[0];
    }
    return s;
  }

  private void search(final int v, final Z s, final int n) {
    if (!s.isZero()) {
      mFx.add(s);
    }
    if (n > 0) {
      for (int k = v; k <= 9; ++k) {
        search(k, s.add(Z.valueOf(k).pow(mN)), n - 1);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mFx.clear();
    search(0, Z.ZERO, mN + 1);
    Collections.sort(mFx);
    final HashMap<Z, Z> vis = new HashMap<>();
    final HashSet<Z> res = new HashSet<>();
    for (final Z start : mFx) {
      if (vis.containsKey(start)) {
        continue;
      }
      Z x = start;
      while (!vis.containsKey(x)) {
        vis.put(x, start);
        x = f(x);
      }
      if (vis.get(x).equals(start)) {
        Z y = x;
        Z min = x;
        do {
          y = f(y);
          if (y.compareTo(min) < 0) {
            min = y;
          }
        } while (!y.equals(x));
        res.add(min);
      }
    }
    return Z.valueOf(res.size());
  }
}

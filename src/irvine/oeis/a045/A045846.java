package irvine.oeis.a045;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionSequence;
import irvine.util.Pair;

/**
 * A045846 Number of distinct ways to cut an n X n square into squares with integer sides.
 * @author Sean A. Irvine
 */
public class A045846 extends MemoryFunctionSequence<Pair<Integer, List<Integer>>, Z> {

  // After Alois P. Heinz

  private int mN = -1;

  private int max(final List<Integer> l) {
    int max = 0;
    for (final int v : l) {
      if (v > max) {
        max = v;
      }
    }
    return max;
  }

  private int min(final List<Integer> l) {
    int min = l.get(0);
    for (final int v : l) {
      if (v < min) {
        min = v;
      }
    }
    return min;
  }

  @Override
  protected Z compute(final Pair<Integer, List<Integer>> key) {
    final int n = key.left();
    final List<Integer> l = key.right();
    if (max(l) > n) {
      return Z.ZERO;
    }
    if (n == 0 || l.isEmpty()) {
      return Z.ONE;
    }
    final int t = min(l);
    if (t > 0) {
      final List<Integer> nl = new ArrayList<>(l.size());
      for (final int v : l) {
        nl.add(v - t);
      }
      return get(new Pair<>(n - t, nl));
    }
    Z s = Z.ZERO;
    int k = -1;
    while (l.get(++k) != 0) {
      // do nothing
    }
    for (int i = k; i < l.size(); ++i) {
      if (l.get(i) != 0) {
        break;
      }
      final List<Integer> nl = new ArrayList<>(l.subList(0, k));
      for (int j = k; j <= i; ++j) {
        nl.add(1 + i - k);
      }
      nl.addAll(l.subList(i + 1, l.size()));
      s = s.add(get(new Pair<>(n, nl)));
    }
    return s;
  }

  @Override
  public Z next() {
    final ArrayList<Integer> l = new ArrayList<>(++mN);
    for (int k = 0; k < mN; ++k) {
      l.add(0);
    }
    return get(new Pair<>(mN, l));
  }
}

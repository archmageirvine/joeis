package irvine.oeis.a388;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A388969 allocated for Ludovic Schwob.
 * @author Sean A. Irvine
 */
public class A388969 extends Sequence0 {

  // After Ludovic Schwob

  private Map<List<Integer>, Z> mD = new HashMap<>();
  private int mN = -1;

  /** Construct the sequence. */
  public A388969() {
    mD.put(Collections.emptyList(), Z.ONE);
  }

  private static List<List<Integer>> covers(final List<Integer> lst, final int odd) {
    final int n = lst.size();
    final List<Integer> l0 = new ArrayList<>(lst);
    l0.add(2 * n + 1);

    List<List<Integer>> l = new ArrayList<>();
    if (odd != 0) {
      final int max = Math.min(1, l0.get(0));
      for (int k = 0; k <= max; ++k) {
        final List<Integer> t = new ArrayList<>();
        t.add(k);
        l.add(t);
      }
    } else {
      l.add(new ArrayList<>());
    }

    for (int i = 0; i < n; ++i) {
      final List<List<Integer>> l2 = new ArrayList<>();
      final int lo = l0.get(i);
      final int hi = Math.min(2 * (i + 1) + odd, l0.get(i + 1));
      for (int k = lo; k <= hi; ++k) {
        for (final List<Integer> x : l) {
          final List<Integer> y = new ArrayList<>(x);
          y.add(k);
          l2.add(y);
        }
      }
      l = l2;
    }

    return l;
  }

  @Override
  public Z next() {
    ++mN;
    final int odd = mN & 1;
    final Map<List<Integer>, Z> d2 = new HashMap<>();
    for (final Map.Entry<List<Integer>, Z> e : mD.entrySet()) {
      for (final List<Integer> t : covers(e.getKey(), odd)) {
        d2.merge(t, e.getValue(), Z::add);
      }
    }
    mD = d2;
    return Functions.SUM.z(mD.values());
  }
}

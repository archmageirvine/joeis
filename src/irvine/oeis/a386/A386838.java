package irvine.oeis.a386;

import java.util.ArrayList;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001481;
import irvine.util.Pair;

/**
 * A386838 allocated for Miles Englezou.
 * @author Sean A. Irvine
 */
public class A386838 extends A001481 {

  private List<Pair<Integer, Integer>> f(final int n) {
    final List<Pair<Integer, Integer>> res = new ArrayList<>();
    for (int x = 0; x * x < n; ++x) {
      final int y2 = n - x * x;
      final int y = Functions.SQRT.i(y2);
      if (y * y == y2 && x <= y) {
        res.add(new Pair<>(x, y));
      }
    }
    return res;
  }

  @Override
  public Z next() {
    final int n = super.next().intValueExact();
    final List<Pair<Integer, Integer>> s = f(n);
    if (s.isEmpty()) {
      return Z.ZERO;
    }
    int min = Integer.MAX_VALUE;
    for (final Pair<Integer, Integer> p : s) {
      final int t = p.left() + p.right() - Functions.GCD.i(p.left(), p.right());
      if (t < min) {
        min = t;
      }
    }
    return Z.valueOf(min);
  }
}

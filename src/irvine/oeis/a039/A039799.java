package irvine.oeis.a039;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039799 For S a subset of [ n ] = {1,2,3,...n}, let B_S = {x+y : x,y in S, x&lt;y}; then a(n) is maximal cardinality of B_S intersect B_{[ n ]-S}.
 * @author Sean A. Irvine
 */
public class A039799 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;

  private TreeSet<Integer> b(final TreeSet<Integer> s) {
    final TreeSet<Integer> res = new TreeSet<>();
    for (final int a : s) {
      for (final int b : s) {
        if (b == a) {
          break;
        }
        res.add(a + b);
      }
    }
    return res;
  }

  private TreeSet<Integer> id(final int n) {
    final TreeSet<Integer> res = new TreeSet<>();
    for (int k = 1; k <= n; ++k) {
      res.add(k);
    }
    return res;
  }

  private int b(final int n, final int i, final TreeSet<Integer> s) {
    if (i == 0) {
      final TreeSet<Integer> d = id(n);
      d.removeAll(s);
      final TreeSet<Integer> b = b(d);
      b.retainAll(b(s));
      return b.size();
    } else {
      final TreeSet<Integer> si = new TreeSet<>(s);
      si.add(i);
      return Integer.max(b(n, i - 1, s), b(n, i - 1, si));
    }
  }

  @Override
  public Z next() {
    return Z.valueOf(b(++mN, mN, new TreeSet<>()));
  }
}

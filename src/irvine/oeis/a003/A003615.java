package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.util.Triple;

/**
 * A003615 Symmetries in planted 4-trees on n+1 vertices.
 * @author Sean A. Irvine
 */
public class A003615 extends A003613 {

  // Cf. comments in A003613

  // T(x,y) = x + (x/6)T(x,y)^3 + (x/2)T(x,y)^2 + x(y-1/2)T(x^2,y^2) + x(1+(y-1/2)T(x^2,y^2))T(x,y) + x(y^L-y+1/3)T(x^3,y^3).
  // 6T(x,y) = 6x + xT(x,y)^3 + 3xT(x,y)^2 + x(6y-3)T(x^2,y^2) + 6xT(x,y) + x(6y-3)T(x^2,y^2)T(x,y) + x(6y^L-6y+2)T(x^3,y^3).

  // xT(x,y)^3
  private List<Triple<Z>> cube(final int n) {
    final List<Triple<Z>> res = new ArrayList<>();
    for (int i = 1; i < n - 2; ++i) {
      for (int j = 1; j + i <= n - 2; ++j) {
        final int k = n - 1 - i - j;
        assert k > 0;
        res.addAll(multiply(multiply(mT.get(i), mT.get(j)), mT.get(k)));
      }
    }
    return res;
  }

  // 3xT(x,y)^2
  private List<Triple<Z>> square(final int n) {
    final List<Triple<Z>> res = new ArrayList<>();
    for (int i = 1; i < n - 1; ++i) {
        final int j = n - 1 - i;
        assert j > 0;
        res.addAll(multiply(multiply(mT.get(i), mT.get(j)), 3));
    }
    return res;
  }

  // x(6y-3)T(x^2,y^2)
  private List<Triple<Z>> subs2a(final int n) {
    if ((n & 1) == 0) {
      return Collections.emptyList();
    }
    final ArrayList<Triple<Z>> res = new ArrayList<>();
    final List<Triple<Z>> lst = substitutePower(mT.get((n - 1) / 2), 2);
    res.addAll(multiply(lst, Y6));
    res.addAll(multiply(lst, -3));
    return res;
  }

  // 6xT(x,y)
  private List<Triple<Z>> linear(final int n) {
    return multiply(mT.get(n - 1), 6);
  }

  // x(6y-3)T(x^2,y^2)T(x,y)
  private List<Triple<Z>> subs2b(final int n) {
    final ArrayList<Triple<Z>> res = new ArrayList<>();
    for (int i = 2; i <= n - 2; i += 2) {
      final int j = n - 1 - i;
      final List<Triple<Z>> lst = substitutePower(mT.get(i / 2), 2);
      final List<Triple<Z>> m = multiply(lst, mT.get(j));
      res.addAll(multiply(m, Y6));
      res.addAll(multiply(m, -3));
    }
    return res;
  }

  // x(6y^L-6y+2)T(x^3,y^3)
  private List<Triple<Z>> subs3(final int n) {
    final int m = n - 1;
    if (m % 3 == 0) {
      final List<Triple<Z>> lst = substitutePower(mT.get(m / 3), 3);
      final ArrayList<Triple<Z>> res = new ArrayList<>(3 * lst.size());
      res.addAll(multiply(lst, YL6));
      res.addAll(multiply(lst, NEG_Y6));
      res.addAll(multiply(lst, 2));
      return res;
    } else {
      return Collections.emptyList();
    }
  }

  @Override
  protected List<Triple<Z>> step(final int n) {
    final ArrayList<Triple<Z>> res = new ArrayList<>(cube(n));
    res.addAll(square(n));
    res.addAll(subs2a(n));
    res.addAll(linear(n));
    res.addAll(subs2b(n));
    res.addAll(subs3(n));
    return divide(collect(res), 6);
  }
}

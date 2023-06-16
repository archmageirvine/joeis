package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Triple;

/**
 * A003613 Number of symmetries in planted (1,4) trees on 3n-1 vertices.
 * @author Sean A. Irvine
 */
public class A003613 extends Sequence1 {

  // Tricky because this g.f. is not really a polynomial until after substitution for y
  // T(x,y) = x + (1/6x)T(x,y)^3 + (1/x)(y-1/2)T(x^2,y^2)T(x,y) + (1/x)(y^L-y+1/3)T(x^3,y^3),
  // where L = log_2(3!).
  // To avoid rational intermediate results, do the 1/6 part last
  // 6T(x,y) = 6x + (1/x)T(x,y)^3 + (1/x)(6y-3)T(x^2,y^2)T(x,y) + (1/x)(6y^L-6y+2)T(x^3,y^3).
  // We do a special purpose calculation, based on the triples and proceed computing
  // one new power of x at each iteration.
  // A triple (a,b,c) corresponds to c*y^(a*L+b).

  protected static final Triple<Z> ONE = new Triple<>(Z.ZERO, Z.ZERO, Z.ONE);
  protected static final Triple<Z> Y6 = new Triple<>(Z.ZERO, Z.ONE, Z.SIX);
  protected static final Triple<Z> NEG_Y6 = new Triple<>(Z.ZERO, Z.ONE, Z.valueOf(-6));
  protected static final Triple<Z> YL6 = new Triple<>(Z.ONE, Z.ZERO, Z.SIX);

  protected int mN = 0;

  // Outer list in powers of x, inner list terms in y.
  protected final ArrayList<List<Triple<Z>>> mT = new ArrayList<>();
  {
    mT.add(null); // 0th term, never consulted
    mT.add(Collections.singletonList(ONE));
  }

  private static Triple<Z> substitutePower(final Triple<Z> t, final int n) {
    return new Triple<>(t.left().multiply(n), t.mid().multiply(n), t.right());
  }

  protected static List<Triple<Z>> substitutePower(final List<Triple<Z>> lst, final int n) {
    final List<Triple<Z>> res = new ArrayList<>(lst.size());
    for (final Triple<Z> t : lst) {
      res.add(substitutePower(t, n));
    }
    return res;
  }

  private static Triple<Z> divide(final Triple<Z> t, final long n) {
    return new Triple<>(t.left(), t.mid(), t.right().divide(n));
  }

  protected static List<Triple<Z>> divide(final List<Triple<Z>> lst, final long n) {
    final List<Triple<Z>> res = new ArrayList<>(lst.size());
    for (final Triple<Z> t : lst) {
      res.add(divide(t, n));
    }
    return res;
  }

  private static Triple<Z> multiply(final Triple<Z> t, final long n) {
    return new Triple<>(t.left(), t.mid(), t.right().multiply(n));
  }

  protected static List<Triple<Z>> multiply(final List<Triple<Z>> lst, final long n) {
    final List<Triple<Z>> res = new ArrayList<>(lst.size());
    for (final Triple<Z> t : lst) {
      res.add(multiply(t, n));
    }
    return res;
  }

  protected static Triple<Z> multiply(final Triple<Z> a, final Triple<Z> b) {
    return new Triple<>(a.left().add(b.left()), a.mid().add(b.mid()), a.right().multiply(b.right()));
  }

  protected static List<Triple<Z>> multiply(final List<Triple<Z>> lst, final Triple<Z> a) {
    final List<Triple<Z>> res = new ArrayList<>(lst.size());
    for (final Triple<Z> t : lst) {
      res.add(multiply(t, a));
    }
    return res;
  }

  protected static List<Triple<Z>> multiply(final List<Triple<Z>> a, final List<Triple<Z>> b) {
    final List<Triple<Z>> res = new ArrayList<>(a.size() * b.size());
    for (final Triple<Z> t : b) {
      res.addAll(multiply(a, t));
    }
    return res;
  }

  // (1/x)*T(x,y)^3
  private List<Triple<Z>> cube(final int n) {
    final List<Triple<Z>> res = new ArrayList<>();
    for (int i = 1; i < n; ++i) {
      for (int j = 1; j + i <= n; ++j) {
        final int k = n + 1 - i - j;
        assert k > 0;
        res.addAll(multiply(multiply(mT.get(i), mT.get(j)), mT.get(k)));
      }
    }
    return res;
  }

  // (1/x)*(6y-3)T(x^2,y^2)T(x,y)
  private List<Triple<Z>> subs2(final int n) {
    final ArrayList<Triple<Z>> res = new ArrayList<>();
    for (int i = 2; i <= n; i += 2) {
      final int j = n + 1 - i;
      final List<Triple<Z>> lst = substitutePower(mT.get(i / 2), 2);
      final List<Triple<Z>> m = multiply(lst, mT.get(j));
      res.addAll(multiply(m, Y6));
      res.addAll(multiply(m, -3));
    }
    return res;
  }

  // (1/x)*(6y^L-6y+2)*T(x^3,y^3)
  private List<Triple<Z>> subs3(final int n) {
    final int m = n + 1;
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

  protected static List<Triple<Z>> collect(final List<Triple<Z>> lst) {
    // Collect like terms together
    final ArrayList<Triple<Z>> res = new ArrayList<>(lst.size());
    for (final Triple<Z> t : lst) {
      boolean found = false;
      for (int k = 0; k < res.size(); ++k) {
        final Triple<Z> a = res.get(k);
        if (t.left().equals(a.left()) && t.mid().equals(a.mid())) {
          found = true;
          res.remove(k);
          final Z mul = t.right().add(a.right());
          if (!mul.isZero()) {
            final Triple<Z> b = new Triple<>(a.left(), a.mid(), mul);
            res.add(b);
          }
          break;
        }
      }
      if (!found && !t.right().isZero()) {
        res.add(t);
      }
    }
    return res;
  }

  // (1/6)
  protected List<Triple<Z>> step(final int n) {
    final ArrayList<Triple<Z>> res = new ArrayList<>(cube(n));
    res.addAll(subs2(n));
    res.addAll(subs3(n));
    return divide(collect(res), 6);
  }

  private Z eval(final Triple<Z> t) {
    // substitute 2 for y
    return Z.SIX.pow(t.left()).shiftLeft(t.mid().longValueExact()).multiply(t.right());
  }

  protected Z eval(final List<Triple<Z>> lst) {
    Z sum = Z.ZERO;
    for (final Triple<Z> t : lst) {
      sum = sum.add(eval(t));
    }
    return sum;
  }

  private Z eval(final int n) {
    return eval(mT.get(n));
  }

  @Override
  public Z next() {
    if (++mN > 0) {
      mT.add(step(mT.size()));
    }
    return eval(mN);
  }
}

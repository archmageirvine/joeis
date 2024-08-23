package irvine.oeis.a071;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071905 a(n) is the smallest positive integer (which is a polynomial of degree 0) that cannot be obtained using the polynomials {x, x+1, ..., x+n} using each polynomial at most once and the operations +, -, *, /.
 * @author Sean A. Irvine
 */
public class A071905 extends Sequence0 {

  // Allows only exact divisions

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  private Z a(final int n, final List<Polynomial<Q>> v) {
    final List<Map<Set<Polynomial<Q>>, Set<Polynomial<Q>>>> r = new ArrayList<>();
    for (int k = 0; k < n; ++k) {
      r.add(new HashMap<>());
    }
    for (final Polynomial<Q> t : v) {
      final HashSet<Polynomial<Q>> s = new HashSet<>();
      s.add(t);
      r.get(0).put(s, new HashSet<>(s));
    }
    final HashSet<Polynomial<Q>> reach = new HashSet<>(v);
    for (int j = 1; j < n; ++j) {
      for (int i = 0; i < (j + 1) / 2; ++i) {
        for (final Set<Polynomial<Q>> s1 : r.get(i).keySet()) {
          for (final Set<Polynomial<Q>> s2 : r.get(j - 1 - i).keySet()) {
            if (Collections.disjoint(s1, s2)) {
              final Set<Polynomial<Q>> s12 = new HashSet<>(s1);
              s12.addAll(s2);
              final Set<Polynomial<Q>> allowed = r.get(s12.size() - 1).computeIfAbsent(s12, s -> new HashSet<>());
              for (final Polynomial<Q> a : r.get(i).get(s1)) {
                for (final Polynomial<Q> b : r.get(j - 1 - i).get(s2)) {
                  final Polynomial<Q> t1 = RING.add(a, b);
                  allowed.add(t1);
                  reach.add(t1);
                  final Polynomial<Q> t2 = RING.multiply(a, b);
                  allowed.add(t2);
                  reach.add(t2);
                  final Polynomial<Q> t3 = RING.subtract(a, b);
                  allowed.add(t3);
                  reach.add(t3);
                  final Polynomial<Q> t4 = RING.negate(t3);
                  allowed.add(t4);
                  reach.add(t4);
                  if (!a.equals(RING.zero())) {
                    final Polynomial<Q>[] qr = RING.divideAndRemainder(b, a);
                    if (qr[1].equals(RING.zero())) {
                      allowed.add(qr[0]);
                      reach.add(qr[0]);
                    }
                  }
                  if (!b.equals(RING.zero())) {
                    final Polynomial<Q>[] qr = RING.divideAndRemainder(a, b);
                    if (qr[1].equals(RING.zero())) {
                      allowed.add(qr[0]);
                      reach.add(qr[0]);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    long k = 0;
    while (reach.contains(Polynomial.create(new Q(++k)))) {
      // do nothing
    }
    return Z.valueOf(k);
  }

  @Override
  public Z next() {
    ++mN;
    final List<Polynomial<Q>> start = new ArrayList<>();
    for (int k = 0; k <= mN; ++k) {
      start.add(Polynomial.create(new Q(k), Q.ONE));
    }
    return a(mN + 1, start);
  }

}

package irvine.oeis.a002;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002844.
 * @author Sean A. Irvine
 */
public class A002844 extends Sequence1 {

  // After Doron Zeilberger

  private int mN = 0;

  private Set<SExpression> binaryTrees(final int n) {
    final Set<SExpression> gu = new HashSet<>();
    if (n == 1) {
      gu.add(new SExpression());
    } else {
      for (int k = 1; k < n; ++k) {
        final Set<SExpression> gu1 = binaryTrees(k);
        final Set<SExpression> gu2 = binaryTrees(n - k);
        for (final SExpression t1 : gu1) {
          for (final SExpression t2 : gu2) {
            gu.add(new SExpression(t1, t2));
          }
        }
      }
    }
    return gu;
  }

  private int numLeaves(final SExpression t) {
    if (t.isEmpty()) {
      return 1;
    } else {
      return numLeaves(t.car()) + numLeaves(t.cdr().car());
    }
  }

  private Set<SExpression> images(final SExpression t) {
    if (numLeaves(t) <= 4) {
      return Collections.singleton(t);
    }
    final HashSet<SExpression> gu = new HashSet<>();
    final SExpression t1 = t.car();
    final SExpression t2 = t.cdr().car();
    final Set<SExpression> gu1 = images(t1);
    final Set<SExpression> gu2 = images(t2);
    for (final SExpression a : gu1) {
      for (final SExpression b : gu2) {
        gu.add(new SExpression(a, b));
      }
    }
    if (numLeaves(t1) >= 2 && numLeaves(t2) >= 2) {
      final SExpression t11 = t1.car();
      final SExpression t12 = t1.cdr().car();
      final SExpression t21 = t2.car();
      final SExpression t22 = t2.cdr().car();
      final Set<SExpression> gu11 = images(t11);
      final Set<SExpression> gu12 = images(t12);
      final Set<SExpression> gu21 = images(t21);
      final Set<SExpression> gu22 = images(t22);
      for (final SExpression t11a : gu11) {
        for (final SExpression t12a : gu12) {
          for (final SExpression t21a : gu21) {
            for (final SExpression t22a : gu22) {
              gu.add(new SExpression(new SExpression(t11a, t21a), new SExpression(t12a, t22a)));
            }
          }
        }
      }
    }
    return gu;
  }

  private Set<SExpression> transitiveClosure(final Set<SExpression> s) {
    final HashSet<SExpression> res = new HashSet<>();
    for (final SExpression t : s) {
      res.addAll(images(t));
    }
    return res;
  }

  private Set<SExpression> transitiveClosure(final SExpression tree) {
    Set<SExpression> gu = new HashSet<>();
    gu.add(tree);
    Set<SExpression> gu1 = transitiveClosure(gu);
    while (!gu.equals(gu1)) {
      final Set<SExpression> gu2 = transitiveClosure(gu1);
      gu = gu1;
      gu1 = gu2;
    }
    return gu1;
  }

  private Set<SExpression> representatives(final int n) {
    final Set<SExpression> gu = binaryTrees(n);
    final Set<SExpression> mu = new HashSet<>();
    while (!gu.isEmpty()) {
      final SExpression gu1 = gu.iterator().next();
      mu.add(gu1);
      gu.removeAll(transitiveClosure(gu1));
    }
    return mu;
  }

  @Override
  public Z next() {
    return Z.valueOf(representatives(++mN).size());
  }
}

package irvine.oeis.a080;

import java.util.HashSet;
import java.util.Set;

import irvine.lisp.SExpression;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a014.A014486;

/**
 * A080035 "Orderly" Friedman numbers (or "good" or "nice" Friedman numbers): Friedman numbers (A036057) where the construction digits are used in the proper order.
 * @author Sean A. Irvine
 */
public class A080035 extends Sequence1 implements Conjectural {

  private static final Q MAX = Q.valueOf(Z.ONE.shiftLeft(20));
  private static final long POW_MAX = 100;
  private long mN = 126;
  private int mK = 0;

  private void add(final Set<Q> set, final Q v) {
    if (v.abs().compareTo(MAX) <= 0) {
      set.add(v);
    }
  }

  private Set<Q> compute(final String digits, final SExpression s) {
    if (!s.isPair()) {
      final HashSet<Q> res = new HashSet<>();
      final Q d = Q.valueOf(digits.charAt(mK++) - '0');
      res.add(d);
      res.add(d.negate()); // unary -
      return res;
    }
    final Set<Q> left = compute(digits, s.car());
    final Set<Q> right = compute(digits, s.cdr());
    final Set<Q> res = new HashSet<>();
    for (final Q u : left) {
      for (final Q v : right) {
        if (!s.car().isPair() && !s.cdr().isPair() && v.signum() >= 0 && !u.isZero()) {
          // Warning: this concatenation is likely insufficient for > 2 digits
          add(res, u.multiply(10).add(v.multiply(u.signum()))); // Concatenation
        }
        add(res, u.add(v));
        add(res, u.subtract(v));
        add(res, u.multiply(v));
        if (v.signum() != 0) {
          add(res, u.divide(v));
        }
        if (v.signum() >= 0 && u.signum() > 0 && v.isInteger()) {
          final long e = v.toZ().longValueExact();
          if (e <= POW_MAX) {
            add(res, u.pow(e));
          }
        }
      }
    }
    return res;
  }

  private boolean is(final long n, final String digits, final SExpression s) {
    mK = 0;
    final Q z = Q.valueOf(n);
    final Set<Q> res = compute(digits, s);
    //System.out.println(mN + " " + res.size() + " " + res);
    for (final Q v : res) {
      if (v.equals(z)) {
        return true;
      }
    }
    return false;
  }

  private boolean is(final long n) {
    final String digits = String.valueOf(n);
    final Sequence parens = new A014486(); // Mechanism to get possible parenthesizations
    final int p = 2 * (digits.length() - 1);
    while (true) {
      final SExpression s = SExpression.binexp2pars(parens.next());
      final int parenCount = s.countParens();
      if (parenCount < p) {
        continue;
      }
      if (parenCount > p) {
        break;
      }
      if (is(n, digits, s)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }

  // Much slower, but potentially more accurate CR based version
//  private static final int ACCURACY = -32;
//  private static final CR MAX = CR.valueOf(Z.ONE.shiftLeft(20));
//  private static final CR POW_MAX = CR.valueOf(100);
//  private long mN = 126;
//  private int mK = 0;
//
//  private void add(final Set<CR> set, final CR v) {
//    if (v.abs().compareTo(MAX, ACCURACY) <= 0) {
//      set.add(v);
//    }
//  }
//
//  private Set<CR> compute(final String digits, final SExpression s) {
//    if (!s.isPair()) {
//      final HashSet<CR> res = new HashSet<>();
//      final CR d = CR.valueOf(digits.charAt(mK++) - '0');
//      res.add(d);
//      res.add(d.negate()); // unary -
//      return res;
//    }
//    final Set<CR> left = compute(digits, s.car());
//    final Set<CR> right = compute(digits, s.cdr());
//    final Set<CR> res = new HashSet<>();
//    for (final CR u : left) {
//      for (final CR v : right) {
//        if (!s.car().isPair() && !s.cdr().isPair() && v.signum(ACCURACY) >= 0) {
//          add(res, u.multiply(10).add(v.multiply(u.signum())); // Concatenation
//        }
//        add(res, u.add(v));
//        add(res, u.subtract(v));
//        add(res, u.multiply(v));
//        if (v.signum(ACCURACY) != 0) {
//          add(res, u.divide(v));
//        }
//        if (v.signum(ACCURACY) >= 0 && u.signum(ACCURACY) > 0 && v.compareTo(POW_MAX, ACCURACY) <= 0) {
//          add(res, u.pow(v));
//        }
//      }
//    }
//    return res;
//  }
//
//  private boolean is(final long n, final String digits, final SExpression s) {
//    mK = 0;
//    final CR z = CR.valueOf(n);
//    final Set<CR> res = compute(digits, s);
//    //System.out.println(mN + " " + res.size() + " " + res);
//    for (final CR v : res) {
//      if (v.compareTo(z, ACCURACY) == 0) {
//        return true;
//      }
//    }
//    return false;
//  }
//
//  private boolean is(final long n) {
//    final String digits = String.valueOf(n);
//    final Sequence parens = new A014486(); // Mechanism to get possible parenthesizations
//    final int p = 2 * (digits.length() - 1);
//    while (true) {
//      final SExpression s = SExpression.binexp2pars(parens.next());
//      final int parenCount = s.countParens();
//      if (parenCount < p) {
//        continue;
//      }
//      if (parenCount > p) {
//        break;
//      }
//      if (is(n, digits, s)) {
//        return true;
//      }
//    }
//    return false;
//  }
//
//  @Override
//  public Z next() {
//    while (true) {
//      if (is(++mN)) {
//        return Z.valueOf(mN);
//      }
//    }
//  }
}

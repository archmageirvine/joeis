package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.expression.Expression;
import irvine.math.expression.Identifier;
import irvine.math.expression.LiteralZ;
import irvine.math.expression.Sircon;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Triple;

/**
 * A003613.
 * @author Sean A. Irvine
 */
public class A003613 implements Sequence {

  // Tricky because not a polynomial until substitution for y
  // T(x,y) = x + (1/6x)T(x,y)^3 + (1/x)(y-1/2)T(x^2,y^2)T(x,y) + (1/x)(y^(log_2(3!))-y+1/3)T(x^3,y^3)

  // todo hmm symbolic expansion does not look good -- negative powers, poor simplification
  // todo currently some of the intermediate results are rationals, need to multiply through by 6

  // A triple (a,b,c) corresponds to c*y^(a*L+b), where L = log_2(3!).
  private static final Triple<Z> ONE = new Triple<>(Z.ZERO, Z.ZERO, Z.ONE);
  private static final Triple<Z> Y = new Triple<>(Z.ZERO, Z.ONE, Z.ONE);
  private static final Triple<Z> NEG_Y = new Triple<>(Z.ZERO, Z.ONE, Z.NEG_ONE);
  private static final Triple<Z> YL = new Triple<>(Z.ONE, Z.ZERO, Z.ONE);

  // Outer list in powers of x, inner list terms in y.
  private final ArrayList<List<Triple<Z>>> mT = new ArrayList<>();
  {
    mT.add(null);
    mT.add(Collections.singletonList(ONE));
  }

  private Triple<Z> substitutePower(final Triple<Z> t, final int n) {
    return new Triple<>(t.left().multiply(n), t.mid().multiply(n), t.right());
  }

  private List<Triple<Z>> substitutePower(final List<Triple<Z>> lst, final int n) {
    final List<Triple<Z>> res = new ArrayList<>(lst.size());
    for (final Triple<Z> t : lst) {
      res.add(substitutePower(t, n));
    }
    return res;
  }

  private Triple<Z> divide(final Triple<Z> t, final long n) {
    return new Triple<>(t.left(), t.mid(), t.right().divide(n));
  }

  private List<Triple<Z>> divide(final List<Triple<Z>> lst, final long n) {
    final List<Triple<Z>> res = new ArrayList<>(lst.size());
    for (final Triple<Z> t : lst) {
      res.add(divide(t, n));
    }
    return res;
  }

  private Triple<Z> multiply(final Triple<Z> a, final Triple<Z> b) {
    return new Triple<>(a.left().add(b.left()), a.mid().add(b.mid()), a.right().multiply(b.right()));
  }

  private List<Triple<Z>> multiply(final List<Triple<Z>> lst, final Triple<Z> a) {
    final List<Triple<Z>> res = new ArrayList<>(lst.size());
    for (final Triple<Z> t : lst) {
      res.add(multiply(t, a));
    }
    return res;
  }

  private List<Triple<Z>> multiply(final List<Triple<Z>> a, final List<Triple<Z>> b) {
    // todo collapse like terms
    final List<Triple<Z>> res = new ArrayList<>(a.size() * b.size());
    for (final Triple<Z> t : b) {
      res.addAll(multiply(a, t));
    }
    return res;
  }

  // (1/6x)*T(x,y)^3
  private List<Triple<Z>> cube(final int n) {
    final List<Triple<Z>> res = new ArrayList<>();
    for (int i = 1; i < n - 2; ++i) {
      for (int j = 1; j + i < n - 2; ++j) {
        final int k = n - i - j - 1;
        assert k > 0;
        res.addAll(multiply(multiply(mT.get(i), mT.get(j)), mT.get(k)));
      }
    }
    return divide(res, 6);
  }

  // (1/x)*(y-1/2)T(x^2,y^2)T(x,y)
  private List<Triple<Z>> subs2(final int n) {
    final ArrayList<Triple<Z>> res = new ArrayList<>();
    for (int i = 2; i < n - 2; i += 2) {
      final int j = n - i;
      final List<Triple<Z>> lst = substitutePower(mT.get(i / 2), 2);
      final List<Triple<Z>> m = multiply(lst, mT.get(j));
      res.addAll(multiply(m, Y));
      res.addAll(divide(m, -2));
    }
    return res;
  }

  // (1/x)*(y^L-y+1/3)*T(x^3,y^3)
  private List<Triple<Z>> subs3(final int n) {
    final int m = n + 1;
    if (m % 3 == 0) {
      final List<Triple<Z>> lst = substitutePower(mT.get(m / 3), 3);
      final ArrayList<Triple<Z>> res = new ArrayList<>();
      res.addAll(multiply(lst, YL));
      res.addAll(multiply(lst, NEG_Y));
      res.addAll(divide(lst, 3));
      return res;
    } else {
      return Collections.emptyList();
    }
  }

  private List<Triple<Z>> step(final int n) {
    final ArrayList<Triple<Z>> res = new ArrayList<>();
    res.addAll(cube(n));
    res.addAll(subs2(n));
    res.addAll(subs3(n));
    return res;
  }

  private long mN = -1;
  private String mTString = "x";

  private String substitutePower(final String t, final int power) {
    return t.replace("x", "(x^" + power + ")").replace("y", "(y^" + power + ")");
  }

  private String step(final String t) {
    final String s = "x+(1/6)*((" + t + ")^3/x)+(y-1/2)*((" + substitutePower(t, 2) + ")/x)*(" + t + ")+(y^l-y+1/3)*((" + substitutePower(t, 3) + ")/x)";
    final Expression e = Sircon.parse(s).expand().eval();
    return e.toString();
  }

  private String replaceLog(final String t) {
    // todo ugh not enough because things like y^2^2^2^l are occurring
    return t.replace("y^l", "6").replaceAll("y\\^([0-9]+)\\^l", "(6^$1)");
  }

  @Override
  public Z next() {
    for (int k = 0; k < 3; ++k) {
      mT.add(step(mT.size()));
      System.out.println("x^" + (mT.size() - 1) + ": " + mT.get(mT.size() - 1));
      mTString = step(mTString);
      System.out.println(mTString);
    }
    System.out.println("T(x,2)=" + Sircon.parse(replaceLog(mTString)).substitute(new Identifier("y"), new LiteralZ(2)).expand().eval().toString().replace("+ -", "-").replace(" ", ""));
    return null;
  }
}

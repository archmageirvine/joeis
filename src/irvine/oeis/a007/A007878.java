package irvine.oeis.a007;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import irvine.math.group.AbstractField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.StandardMultiply;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A007878 Number of terms in discriminant of generic polynomial of degree <code>n</code>.
 * @author Sean A. Irvine
 */
public class A007878 implements Sequence {

  // This might work but is stupidly slow ... It got as far as a(4).

  private static class SymbolicField extends AbstractField<Pair<CycleIndex, CycleIndex>> {

    @Override
    public Z size() {
      return null;
    }

    @Override
    public boolean contains(final Pair<CycleIndex, CycleIndex> element) {
      return true;
    }

    @Override
    public Iterator<Pair<CycleIndex, CycleIndex>> iterator() {
      throw new UnsupportedOperationException();
    }

    private static final Pair<CycleIndex, CycleIndex> ZERO = new Pair<>(CycleIndex.ZERO, CycleIndex.ONE);

    @Override
    public Pair<CycleIndex, CycleIndex> zero() {
      return ZERO;
    }

    @Override
    public Pair<CycleIndex, CycleIndex> add(final Pair<CycleIndex, CycleIndex> a, final Pair<CycleIndex, CycleIndex> b) {
      final CycleIndex num = a.left().op(StandardMultiply.OP, b.right());
      num.add(b.left().op(StandardMultiply.OP, a.right()));
      final CycleIndex den = a.right().op(StandardMultiply.OP, b.right());
      num.setName("");
      den.setName("");
      return new Pair<>(num, den);
    }

    @Override
    public Pair<CycleIndex, CycleIndex> negate(final Pair<CycleIndex, CycleIndex> a) {
      if (a.left().equals(CycleIndex.ZERO)) {
        return a;
      }
      final CycleIndex neg = a.left().copy();
      neg.multiply(Q.NEG_ONE);
      return new Pair<>(neg, a.right());
    }

    @Override
    public Pair<CycleIndex, CycleIndex> coerce(final long n) {
      if (n == 0) {
        return zero();
      }
      final CycleIndex nn = CycleIndex.ONE.copy();
      nn.multiply(new Q(n));
      return new Pair<>(nn, CycleIndex.ONE);
    }

    private static final Pair<CycleIndex, CycleIndex> ONE = new Pair<>(CycleIndex.ONE, CycleIndex.ONE);

    @Override
    public Pair<CycleIndex, CycleIndex> one() {
      return ONE;
    }

    @Override
    public Pair<CycleIndex, CycleIndex> multiply(final Pair<CycleIndex, CycleIndex> a, final Pair<CycleIndex, CycleIndex> b) {
      final CycleIndex num = a.left().op(StandardMultiply.OP, b.left());
      final CycleIndex den = a.right().op(StandardMultiply.OP, b.right());
      num.setName("");
      den.setName("");
      return new Pair<>(num, den);
    }

    @Override
    public Pair<CycleIndex, CycleIndex> inverse(final Pair<CycleIndex, CycleIndex> element) {
      throw new UnsupportedOperationException();
    }

    @Override
    public Pair<CycleIndex, CycleIndex> divide(final Pair<CycleIndex, CycleIndex> n, final Pair<CycleIndex, CycleIndex> d) {
      if (d.equals(zero())) {
        throw new ArithmeticException();
      }
      if (d.equals(one())) {
        return n;
      }
      if (n.left().isEmpty()) {
        return zero();
      }
      if (n.equals(d)) {
        return ONE;
      }
      final CycleIndex num = n.left().op(StandardMultiply.OP, d.right());
      final CycleIndex den = n.right().op(StandardMultiply.OP, d.left());
      num.setName("");
      den.setName("");
      try {
        final CycleIndex num2 = A007878.divide(num, den);
        return new Pair<>(num2, CycleIndex.ONE);
      } catch (final UnsupportedOperationException e) {
        return new Pair<>(num, den);
      }
    }
  }

  private static MultivariateMonomial divide(final MultivariateMonomial n, final MultivariateMonomial d) {
    final MultivariateMonomial res = new MultivariateMonomial();
    for (final Pair<String, Integer> dk : d.keySet()) {
      if (!n.containsKey(dk)) {
        return null;
      }
    }
    for (final Map.Entry<Pair<String, Integer>, Z> e : n.entrySet()) {
      final Pair<String, Integer> key = e.getKey();
      final Z np = e.getValue();
      final Z dp = d.get(key);
      if (dp == null) {
        res.add(key, np);
      } else if (dp.compareTo(np) > 0) {
        return null;
      } else {
        res.add(key, np.subtract(dp));
      }
    }
    res.setCoefficient(n.getCoefficient().divide(d.getCoefficient()));
    return res;
  }

  private static CycleIndex divide(final CycleIndex n, final CycleIndex d) {
    final CycleIndex q = CycleIndex.ZERO.copy();
    final CycleIndex f = n.copy();
    while (!(f.equals(CycleIndex.ZERO))) {
      final MultivariateMonomial lf = f.leadingTerm();
      final MultivariateMonomial ld = d.leadingTerm();
      final MultivariateMonomial u = divide(lf, ld);
      if (u == null) {
        throw new UnsupportedOperationException("Failed to divide exactly: " + f + " / " + d);
      }
      q.add(u);
      f.subtract(d.multiply(u));
    }
    return q;
  }

  private static final PolynomialRingField<Pair<CycleIndex, CycleIndex>> RING = new PolynomialRingField<>(new SymbolicField());
  private int mN = 1;

  @Override
  public Z next() {
    final ArrayList<Pair<CycleIndex, CycleIndex>> elements = new ArrayList<>(++mN);
    for (int k = 0; k < mN; ++k) {
      elements.add(new Pair<>(new CycleIndex("", MultivariateMonomial.create(k, 1)), CycleIndex.ONE));
    }
    final Polynomial<Pair<CycleIndex, CycleIndex>> poly = RING.create(elements);
    final Pair<CycleIndex, CycleIndex> discriminant = RING.discriminant(poly);
   // System.out.println(discriminant);
    final CycleIndex disc = divide(discriminant.left(), discriminant.right());
    //System.out.println(disc);
    return Z.valueOf(disc.size());
  }
}

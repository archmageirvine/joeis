package irvine.math.polynomial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import irvine.math.group.MultivariatePolynomialField;
import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.util.Pair;
import irvine.util.Point;

/**
 * Represent a cycle index structure.
 * @author Sean A. Irvine
 */
public final class CycleIndex extends TreeMap<String, MultivariateMonomial> {

  /** The zero cycle index. */
  public static final CycleIndex ZERO = new CycleIndex("0");
  static {
    ZERO.multiply(Q.ZERO);
  }
  /** The unit cycle index. */
  public static final CycleIndex ONE = new CycleIndex("1", new MultivariateMonomial());

  private String mName;

  /**
   * Construct a new cycle index from the given monomials.
   * @param name name of this cycle index
   * @param monomials terms to include
   */
  public CycleIndex(final String name, final MultivariateMonomial... monomials) {
    super();
    mName = name;
    for (final MultivariateMonomial m : monomials) {
      add(m);
    }
  }

  /**
   * Construct the zero cycle index.
   */
  public CycleIndex() {
    this("0");
  }

  /**
   * Return an independent copy of this cycle index.
   * @return copy
   */
  public CycleIndex copy() {
    final CycleIndex copy = new CycleIndex(getName());
    for (Map.Entry<String, MultivariateMonomial> e : entrySet()) {
      copy.put(e.getKey(), e.getValue().copy());
    }
    return copy;
  }

  /**
   * Add the specified monomial into the cycle index structure, taking account
   * of any existing term with the same power structure.
   * @param monomial monomial to include
   */
  public void add(final MultivariateMonomial monomial) {
    if (!Q.ZERO.equals(monomial.getCoefficient())) {
      final String key = monomial.termKey();
      final MultivariateMonomial z = get(key);
      //final MultivariateMonomial z = find(monomial);
      //System.out.println("Looked up " + key + " in " + this.toString() + " found " + z);
      if (z == null) {
        put(key, monomial.copy()); // use a copy in case its gets munged elsewhere
      } else if (Q.ZERO.equals(z.add(monomial.getCoefficient()))) {
        remove(key);
      }
    }
  }

  /**
   * Add the content of another cycle index to this cycle index.
   * @param index other cycle index
   */
  public void add(final CycleIndex index) {
    for (final MultivariateMonomial m : index.values()) {
      add(m);
    }
  }


  /**
   * Subtract the specified monomial into the cycle index structure, taking account
   * of any existing term with the same power structure.
   * @param monomial monomial to include
   */
  public void subtract(final MultivariateMonomial monomial) {
    if (!Q.ZERO.equals(monomial.getCoefficient())) {
      final MultivariateMonomial m = monomial.copy();
      m.setCoefficient(monomial.getCoefficient().negate());
      final String key = monomial.termKey();
      final MultivariateMonomial z = get(key);
      if (z == null) {
        put(key, m.copy());
      } else if (Q.ZERO.equals(z.add(m.getCoefficient()))) {
        remove(key);
      }
    }
  }

  /**
   * Subtract the content of another cycle index to this cycle index.
   * @param index other cycle index
   */
  public void subtract(final CycleIndex index) {
    for (final MultivariateMonomial m : index.values()) {
      subtract(m);
    }
  }

  /**
   * Multiply entire cycle index by specified scalar constant.
   * @param value scalar
   */
  public void multiply(final Q value) {
    for (final MultivariateMonomial m : values()) {
      m.multiply(value);
    }
  }

  /**
   * Multiply through this cycle index by a specific monomial.
   * @param monomial monomial to multiply by
   * @param degreeLimit limit on total degree of terms in the product
   * @return result of multiplication
   */
  public CycleIndex multiply(final MultivariateMonomial monomial, final int degreeLimit) {
    final CycleIndex res = new CycleIndex(getName() + "*" + monomial);
    for (final MultivariateMonomial m : values()) {
      if (m.totalDegree().add(monomial.totalDegree()).intValueExact() <= degreeLimit) {
        final MultivariateMonomial copy = m.copy();
        copy.multiply(monomial);
        res.add(copy);
      }
    }
    return res;
  }

  /**
   * Multiply through this cycle index by a specific monomial.
   * @param monomial monomial to multiply by
   * @return result of multiplication
   */
  public CycleIndex multiply(final MultivariateMonomial monomial) {
    return multiply(monomial, Integer.MAX_VALUE);
  }

  /**
   * Perform a linearized extension of the given monomial operation using this
   * cycle index and <code>m</code>.
   * @param op operation
   * @param m other cycle index
   * @param degreeLimit limit on the total degree of terms retained
   * @return result of linearized operation
   */
  public CycleIndex op(final MultivariateMonomialOperation op, final CycleIndex m, final Z degreeLimit) {
    final CycleIndex res = new CycleIndex(getName() + "*" + m.getName());
    for (final MultivariateMonomial a : values()) {
      for (final MultivariateMonomial b : m.values()) {
        final MultivariateMonomial r = op.op(a, b);
        if (degreeLimit == null || r.totalDegree().compareTo(degreeLimit) <= 0) {
          res.add(r);
        }
      }
    }
    return res;
  }

  /**
   * Perform a linearized extension of the given monomial operation using this
   * cycle index and <code>m</code>.
   * @param op operation
   * @param m other cycle index
   * @return result of linearized operation
   */
  public CycleIndex op(final MultivariateMonomialOperation op, final CycleIndex m) {
    return op(op, m, null);
  }

  private static CycleIndex pow(final MultivariateMonomialOperation op, final CycleIndex cycleIndex, final int exponent, final int maxDegree) {
    if (exponent < 0) {
      throw new IllegalArgumentException();
    }
    // x^0
    if (exponent == 0) {
      return CycleIndex.ONE;
    }
    // 0^x
    if (cycleIndex.size() == 0) {
      return cycleIndex;
    }
    // x^1
    if (exponent == 1) {
      return cycleIndex;
    }
    final Z degreeLimit = Z.valueOf(maxDegree);
    final CycleIndex s = pow(op, cycleIndex.op(op, cycleIndex, degreeLimit), exponent / 2, maxDegree);
    return (exponent & 1) == 0 ? s : s.op(op, cycleIndex, degreeLimit);
  }

  /**
   * Return a power of this cycle index subject to a degree constraint.
   * @param n power
   * @param maxDegree maximum degree of monomial terms
   * @return powered cycle index
   */
  public CycleIndex pow(final int n, final int maxDegree) {
    return pow(StandardMultiply.OP, this, n, maxDegree);
  }

  /**
   * Return a power of this cycle index subject to a degree constraint.
   * @param op the underlying multiply operation
   * @param n power
   * @param maxDegree maximum degree of monomial terms
   * @return powered cycle index
   */
  public CycleIndex pow(final MultivariateMonomialOperation op, final int n, final int maxDegree) {
    return pow(op, this, n, maxDegree);
  }

  public void setName(final String name) {
    mName = name;
  }

  public String getName() {
    return mName;
  }

  /**
   * Return a version of this cycle index with relabeled variables.
   * @param a old variable name
   * @param b new variable name
   * @return relabeled monomial
   */
  public CycleIndex relabel(final String a, final String b) {
    if (a.equals(b)) {
      return this;
    }
    final CycleIndex copy = new CycleIndex(getName());
    for (final MultivariateMonomial m : values()) {
      copy.add(m.relabel(a, b));
    }
    return copy;
  }

  /**
   * Return the maximum index of any variable in this cycle index.
   * @return maximum index
   */
  public int maxIndex() {
    int max = 0;
    for (final MultivariateMonomial m : values()) {
      max = Math.max(max, m.maxIndex());
    }
    return max;
  }

  /**
   * The formal derivative of this cycle index with respect to a particular variable.
   * @param var variable name
   * @param index index of variable
   * @return derivative
   */
  public CycleIndex diff(final String var, final int index) {
    final CycleIndex res = new CycleIndex("diff(" + getName() + ")");
    for (final MultivariateMonomial m : values()) {
      res.add(m.diff(var, index));
    }
    return res;
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private Polynomial<Q> getSubs(final ArrayList<Polynomial<Q>> substitutes, final int power) {
    while (power >= substitutes.size()) {
      substitutes.add(substitutes.get(1).substitutePower(substitutes.size()));
    }
    return substitutes.get(power);
  }

  /**
   * Apply this cycle index to the given polynomial, limiting the degree of the result.
   * @param poly the polynomial
   * @param maxDegree maximum degree term guaranteed to retain in the result
   * @return polynomial result
   */
  public Polynomial<Q> apply(final Polynomial<Q> poly, final int maxDegree) {
    final ArrayList<Polynomial<Q>> substitutes = new ArrayList<>();
    substitutes.add(RING.one());
    substitutes.add(poly);
    Polynomial<Q> result = RING.zero();
    for (final MultivariateMonomial m : values()) {
      Polynomial<Q> term = RING.one();
      for (final Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
        term = RING.multiply(term, RING.pow(getSubs(substitutes, e.getKey().right()), e.getValue().intValueExact(), maxDegree), maxDegree);
      }
      term = RING.multiply(term, m.getCoefficient());
      result = RING.add(result, term);
    }
    return result;
  }

  private MultivariatePolynomial<Q> getSubs(final ArrayList<MultivariatePolynomial<Q>> substitutes, final int power, final int[] degreeLimits) {
    while (power >= substitutes.size()) {
      final int[] sp = new int[degreeLimits.length];
      Arrays.fill(sp, substitutes.size());
      substitutes.add(substitutes.get(1).substitutePowers(sp, degreeLimits));
    }
    return substitutes.get(power);
  }

  /**
   * Apply this cycle index to the given multivariate polynomial, limiting the degree of the result.
   * @param poly the multivariate polynomial
   * @param degreeLimits maximum degree term guaranteed to retain in the result in each variate
   * @return multivariate polynomial result
   */
  public MultivariatePolynomial<Q> apply(final MultivariatePolynomial<Q> poly, final int[] degreeLimits) {
    final MultivariatePolynomialField<Q> field = new MultivariatePolynomialField<>(Rationals.SINGLETON, poly.numberVariables());
    final ArrayList<MultivariatePolynomial<Q>> substitutes = new ArrayList<>();
    substitutes.add(field.one());
    substitutes.add(poly);
    MultivariatePolynomial<Q> result = field.zero();
    for (final MultivariateMonomial m : values()) {
      MultivariatePolynomial<Q> term = field.one();
      for (final Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
        term = field.multiply(term, field.pow(getSubs(substitutes, e.getKey().right(), degreeLimits), e.getValue().intValueExact(), degreeLimits), degreeLimits);
      }
      term = field.multiply(term, m.getCoefficient());
      result = field.add(result, term);
    }
    return result;
  }

  /**
   * Apply this cycle index to the given polynomial, limiting the degree of the result.
   * @param polys the polynomials to substitute (with <code>x_1</code> is position 0 of array)
   * @param maxDegree maximum degree term guaranteed to retain in the result
   * @return polynomial result
   */
  public Polynomial<Q> apply(final List<Polynomial<Q>> polys, final Z maxDegree) {
    Polynomial<Q> result = RING.zero();
    for (final MultivariateMonomial m : values()) {
      Polynomial<Q> term = RING.one();
      for (final Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
        final int index = e.getKey().right() - 1;
        if (index < polys.size()) {
          final Z power = e.getValue();
          final int degreeLimit = maxDegree.intValueExact();
          term = RING.multiply(term, RING.powz(polys.get(index), power, degreeLimit), degreeLimit);
        }
      }
      term = RING.multiply(term, m.getCoefficient());
      result = RING.add(result, term);
    }
    return result;
  }

  private static Q apply(final MultivariateMonomial p, final int... v) {
    // todo recast this without maxIndex
    final int m = p.maxIndex();
    Z powerOf2 = Z.ZERO;
    for (int k = 1, t = 0; k <= m; ++k) {
      final int vt = v[t++];
      final Z degree = p.get(new Pair<>(MultivariateMonomial.DEFAULT_VARIABLE, k));
      if (vt == 0 && degree.signum() > 0) {
        return Q.ZERO;
      }
      powerOf2 = powerOf2.add(degree.multiply(vt));
      if (t == v.length) {
        t = 0;
      }
    }
    return p.getCoefficient().multiply(Z.ONE.shiftLeft(powerOf2.intValueExact()));
  }

  /**
   * Evaluate this cycle index using the given variable substitutions.
   * @param subs variable substitutions
   * @return value of cycle index
   */
  public Q eval(final long... subs) {
    Q sum = Q.ZERO;
    for (final MultivariateMonomial m : values()) {
      sum = sum.add(m.eval(subs));
    }
    return sum;
  }

  /**
   * Apply the variables to the indeterminates in this cycle index and
   * return the evaluation. Variables are used repeatedly until all
   * indeterminates are handled.
   *
   * @param v values
   * @return evaluation
   */
  public Q apply(final int... v) {
    Q s = Q.ZERO;
    for (final MultivariateMonomial p : values()) {
      s = s.add(apply(p, v));
    }
    return s;
  }

  /**
   * Replace each indeterminate with <code>1+x^n</code>.
   * @param maxDegree maximum degree of the result
   * @return polynomial result
   * @exception ArithmeticException if the application does not yield an integer polynomial.
   */
  public Polynomial<Q> applyOnePlusXToTheN(final int maxDegree) {
    Polynomial<Q> result = RING.zero();
    for (final MultivariateMonomial m : values()) {
      Polynomial<Q> term = RING.one();
      for (final Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
        term = RING.multiply(term, RING.pow(RING.onePlusXToTheN(e.getKey().right()), e.getValue().intValueExact(), maxDegree), maxDegree);
      }
      term = RING.multiply(term, m.getCoefficient());
      result = RING.add(result, term);
    }
    return result;
  }

  /**
   * Replace each indeterminate with <code>1+x^n</code>.
   * @return polynomial result
   * @exception ArithmeticException if the application does not yield an integer polynomial.
   */
  public Polynomial<Q> applyOnePlusXToTheN() {
    return applyOnePlusXToTheN(Integer.MAX_VALUE);
  }

  private CycleIndex scaleIndex(final int k) {
    final CycleIndex res = new CycleIndex(getName() + "[" + k + "]");
    for (final MultivariateMonomial m : values()) {
      final MultivariateMonomial copy = m.pow(k);
      res.add(copy);
    }
    return res;
  }

  /**
   * Replace <code>x_k</code> in this cycle index with <code>g(z_1^k,...,z_m^k,...)</code>.
   * @param g a cycle index
   * @param n maximum degree term to retain
   * @return application
   */
  public CycleIndex apply(final CycleIndex g, final int n) {
    final CycleIndex res = new CycleIndex("(" + getName() + "," + g.getName() + ")");
    final HashMap<Point, CycleIndex> gCache = new HashMap<>();
    for (final MultivariateMonomial m : values()) {
      CycleIndex r = CycleIndex.ONE;
      for (final Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
        final int k = e.getKey().right();
        final Point key = new Point(k, e.getValue().intValueExact());
        CycleIndex gkl = gCache.get(key);
        if (gkl == null) {
          final CycleIndex gk = g.scaleIndex(k);
          gkl = gk.pow(e.getValue().intValueExact(), n);
          gCache.put(key, gkl);
        }
        r = r.op(StandardMultiply.OP, gkl, Z.valueOf(n));
      }
      r.multiply(m.getCoefficient());
      res.add(r);
    }
    return res;
  }

  /**
   * Replace <code>x_k^j</code> in this cycle index with <code>g(k)^j</code>.
   * @param op underlying multiply operation
   * @param g a cycle index
   * @return application
   */
  public CycleIndex apply(final MultivariateMonomialOperation op, final List<CycleIndex> g) {
    final CycleIndex res = new CycleIndex("[" + getName() + "]"); // todo include names from g?
    // todo could cache powers of g?
    for (final MultivariateMonomial m : values()) {
      CycleIndex r = CycleIndex.ONE;
      for (final Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
        final int k = e.getKey().right();
        final CycleIndex gk = g.get(k);
        final CycleIndex gkl = gk.pow(op, e.getValue().intValueExact(), Integer.MAX_VALUE);
        r = r.op(op, gkl);
      }
      r.multiply(m.getCoefficient());
      res.add(r);
    }
    return res;
  }

  private CycleIndex scale(final int k) {
    final CycleIndex r = new CycleIndex(getName() + "_" + k);
    for (final MultivariateMonomial m : values()) {
      final MultivariateMonomial scale = new MultivariateMonomial();
      scale.setCoefficient(m.getCoefficient());
      for (final Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
        scale.add(e.getKey().left(), e.getKey().right() * k, e.getValue());
      }
      r.add(scale);
    }
    return r;
  }

  /**
   * Replace <code>x_k</code> in this cycle index with <code>g(z_k,...,z_mk,...)</code>.
   * @param g a cycle index
   * @return application
   */
  public CycleIndex wreath(final CycleIndex g) {
    final CycleIndex res = new CycleIndex(getName() + "[" + g.getName() + "]");
    final HashMap<Integer, CycleIndex> gCache = new HashMap<>();
    for (final MultivariateMonomial m : values()) {
      CycleIndex r = CycleIndex.ONE;
      for (final Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
        final int k = e.getKey().right();
        final CycleIndex gkl = gCache.computeIfAbsent(k, g::scale);
        r = r.op(StandardMultiply.OP, gkl.pow(e.getValue().intValueExact(), Integer.MAX_VALUE));
      }
      r.multiply(m.getCoefficient());
      res.add(r);
    }
    return res;
  }

  private static Z diffCoeff(final int k, final int e, final int m) {
    if (m > e) {
      return Z.ZERO;
    }
    Z f = Z.ONE;
    for (int j = e - m + 1; j <= e; ++j) {
      f = f.multiply(j);
    }
    return Z.valueOf(k).pow(m).multiply(f);
  }

  /**
   * Apply de Bruijn theorem of partial derivatives of this cycle index to the
   * given cycle index to compute number of invertible functions.
   *
   * @param range cycle index to apply to
   * @return equivalence class count
   */
  public Z invertible(final CycleIndex range) {
    Q sum = Q.ZERO;
    //System.out.println("Domain: " + this);
    //System.out.println("Range: " + range);
    for (final MultivariateMonomial dplex : values()) {
      for (final MultivariateMonomial rplex : range.values()) {
        Q p = dplex.getCoefficient().multiply(rplex.getCoefficient());
        for (int k = 1; k <= dplex.maxIndex(); ++k) {
          final Pair<String, Integer> kKey = new Pair<>(MultivariateMonomial.DEFAULT_VARIABLE, k);
          p = p.multiply(diffCoeff(k, rplex.get(kKey).intValueExact(), dplex.get(kKey).intValueExact()));
        }
        sum = sum.add(p);
      }
    }
    return sum.toZ();
  }

  private static Z partialDiff(final int j, final int k, final int n) {
    // coeff in diff(exp(n*k*(z_k+z_{2k}+z_{3k}+...)),z_j)
    return j % k == 0 ? Z.valueOf(n).multiply(k) : Z.ZERO;
  }

  private static Q partialDiff(final MultivariateMonomial partial, final MultivariateMonomial plex) {
    final int n = partial.maxIndex();
    Q prod = Q.ONE;
    for (final Map.Entry<Pair<String, Integer>, Z> e : partial.entrySet()) {
      final Z exponent = e.getValue();
      if (exponent.signum() > 0) {
        Z g = Z.ZERO;
        for (int j = 1; j <= n; ++j) {
          final Z contrib = partialDiff(e.getKey().right(), j, plex.get(new Pair<>(MultivariateMonomial.DEFAULT_VARIABLE, j)).intValueExact());
          //System.out.println(k + " " + j + " " + contrib);
          g = g.add(contrib);
        }
        g = g.pow(exponent);
        prod = prod.multiply(g);
      }
    }
    return prod.multiply(plex.getCoefficient());
  }

  private static Q partialDiff(final MultivariateMonomial partial, final CycleIndex base) {
    Q sum = Q.ZERO;
    for (final MultivariateMonomial plex : base.values()) {
      final Q c = partialDiff(partial, plex);
      //System.out.println(partial + " " + plex + " -> " + c);
      sum = sum.add(c);
    }
    return sum.multiply(partial.getCoefficient());
  }

  /**
   * Apply de Bruijn theorem of partial derivatives of this cycle index to the
   * given cycle index.
   *
   * @param base cycle index to apply to
   * @return equivalence class count
   */
  public Z deBruijn(final CycleIndex base) {
    Q sum = Q.ZERO;
    for (final MultivariateMonomial monomial : values()) {
      sum = sum.add(partialDiff(monomial, base));
    }
    //System.out.println("before order: " + sum);
    return sum.toZ();
  }

  /**
   * Truncate this cycle index to terms with maximum specified total degree.
   * @param degree maximum degree
   * @return truncated cycle index
   */
  public CycleIndex truncate(final int degree) {
    final CycleIndex res = new CycleIndex(getName() + "[" + degree + "]");
    for (final MultivariateMonomial m : values()) {
      if (m.totalDegree().intValueExact() <= degree) {
        res.add(m);
      }
    }
    return res;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    if (isEmpty()) {
      sb.append('0');
    } else {
      // TreeSet below does the sorting
      for (final MultivariateMonomial m : new TreeSet<>(values())) {
        if (sb.length() != 0) {
          sb.append(" + ");
        }
        sb.append(m);
      }
    }
    return getName() + " = " + sb;
  }

  /**
   * Leading term in lexicographic ordering.
   * @return leading multivariate monomial
   */
  public MultivariateMonomial leadingTerm() {
    MultivariateMonomial lead = MultivariateMonomial.ZERO;
    for (final MultivariateMonomial mm : values()) {
      if (mm.compareTo(lead) > 0) {
        lead = mm;
      }
    }
    return lead;
  }
}

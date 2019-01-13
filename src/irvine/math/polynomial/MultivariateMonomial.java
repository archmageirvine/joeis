package irvine.math.polynomial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * Container for a multivariate monomial.  Developed for representing and
 * aiding calculations involving cycle index structures, rather than
 * general multivariate polynomial calculations.
 * @author Sean A. Irvine
 */
public class MultivariateMonomial extends HashMap<Pair<String, Integer>, Z> implements Comparable<MultivariateMonomial> {

  /** Default variable name. */
  public static final String DEFAULT_VARIABLE = "x";

  /** The zero monomial. */
  public static final MultivariateMonomial ZERO = new MultivariateMonomial();
  static {
    ZERO.setCoefficient(Q.ZERO);
  }

  /**
   * Create the monomial <code>coeff * x_index^power</code>.
   * @param index variable index
   * @param power exponent
   * @param coeff coefficient
   * @return monomial
   */
  public static MultivariateMonomial create(final int index, final Z power, final Q coeff) {
    final MultivariateMonomial x = new MultivariateMonomial();
    x.add(index, power);
    x.setCoefficient(coeff);
    return x;
  }

  /**
   * Create the monomial <code>x_index^power</code>.
   * @param index variable index
   * @param power exponent
   * @return monomial
   */
  public static MultivariateMonomial create(final int index, final Z power) {
    final MultivariateMonomial x = new MultivariateMonomial();
    x.add(index, power);
    return x;
  }

  /**
   * Create the monomial <code>x_index^power</code>.
   * @param index variable index
   * @param power exponent
   * @return monomial
   */
  public static MultivariateMonomial create(final int index, final long power) {
    return create(index, Z.valueOf(power));
  }

  private Q mCoefficient = Q.ONE;
  private Z mTotalDegree = Z.ZERO;
  private String mTermKey = null;

  public Q getCoefficient() {
    return mCoefficient;
  }

  /**
   * Set the coefficient of this monomial.
   * @param coefficient coefficient to set
   */
  public void setCoefficient(final Q coefficient) {
    mCoefficient = coefficient;
    if (Q.ZERO.equals(mCoefficient)) {
      clear();
      mTotalDegree = Z.ZERO;
      mTermKey = null;
    }
  }

  /**
   * Convenience method to set the coefficient from an integer.
   * @param coefficient coefficient to set
   */
  public void setCoefficient(final Z coefficient) {
    setCoefficient(new Q(coefficient));
  }

  /**
   * Multiply an additional term into the coefficient.
   * @param coefficient extra term to include
   */
  public void multiply(final Z coefficient) {
    setCoefficient(mCoefficient.multiply(coefficient));
  }

  /**
   * Multiply an additional term into the coefficient.
   * @param coefficient extra term to include
   */
  public void multiply(final Q coefficient) {
    setCoefficient(mCoefficient.multiply(coefficient));
  }

  /**
   * Add an additional term to the coefficient.
   * @param coefficient extra term to add
   * @return the resulting coefficient
   */
  public Q add(final Q coefficient) {
    setCoefficient(mCoefficient.add(coefficient));
    return mCoefficient;
  }

  /**
   * Include <code>varName_index^power</code> in this monomial.  If the
   * monomial already contains this variable then the power is incremented
   * accordingly.
   * @param key variable index pair
   * @param power power for indexed variable
   */
  public void add(final Pair<String, Integer> key, final Z power) {
    if (!Q.ZERO.equals(getCoefficient())) {
      final Z z = get(key).add(power);
      if (z.signum() != 0) {
        put(key, z);
      } else {
        remove(key);
      }
      mTermKey = null;
      mTotalDegree = mTotalDegree.add(power);
    }
  }

  /**
   * Include <code>varName_index^power</code> in this monomial.  If the
   * monomial already contains this variable then the power is incremented
   * accordingly.
   * @param varName variable name
   * @param index index of variable
   * @param power power for indexed variable
   */
  public void add(final String varName, final int index, final Z power) {
    add(new Pair<>(varName, index), power);
  }

  /**
   * Multiply this monomial by another monomial.
   * @param monomial monomial to multiply by
   */
  public void multiply(final MultivariateMonomial monomial) {
    for (final Map.Entry<Pair<String, Integer>, Z> e : monomial.entrySet()) {
      add(e.getKey(), e.getValue());
    }
    multiply(monomial.getCoefficient());
  }

  /**
   * Include <code>x_index^power</code> in this monomial.  If the
   * monomial already contains this variable then the power is incremented
   * accordingly.
   * @param index index of variable
   * @param power power for indexed variable
   */
  public void add(final int index, final Z power) {
    add(DEFAULT_VARIABLE, index, power);
  }

  /**
   * Include <code>x_index^power</code> in this monomial.  If the
   * monomial already contains this variable then the power is incremented
   * accordingly.
   * @param index index of variable
   * @param power power for indexed variable
   */
  public void add(final int index, final long power) {
    add(index, Z.valueOf(power));
  }

  @Override
  public Z get(final Object key) {
    final Z res = super.get(key);
    return res == null ? Z.ZERO : res;
  }

  /**
   * Return a key representing the variables and powers but ignoring the
   * leading coefficient.
   * @return term key
   */
  public String termKey() {
    if (mTermKey == null) {
      final ArrayList<String> keys = new ArrayList<>(size());
      for (final Map.Entry<Pair<String, Integer>, Z> e : entrySet()) {
        keys.add(e.toString());
      }
      Collections.sort(keys);
      mTermKey = keys.toString();
    }
    return mTermKey;
  }

  /**
   * Return the maximum index for any variable.
   * @return the maximum index
   */
  public int maxIndex() {
    int max = 0;
    for (final Pair<String, Integer> k : keySet()) {
      if (k.right() > max) {
        max = k.right();
      }
    }
    return max;
  }

  /**
   * The sum of the powers on the variables in this monomial.
   * @return sum of powers
   */
  public Z totalDegree() {
    return mTotalDegree;
  }

  /**
   * Return a copy of this monomial.
   * @return copy
   */
  public MultivariateMonomial copy() {
    final MultivariateMonomial copy = new MultivariateMonomial();
    copy.setCoefficient(getCoefficient());
    copy.putAll(this);
    copy.mTermKey = mTermKey;
    copy.mTotalDegree = mTotalDegree;
    return copy;
  }

  /**
   * Return a copy of this monomial with each variable raised to the power;
   * but with the coefficient unchanged.
   * @param k power
   * @return powered monomial
   */
  public MultivariateMonomial pow(final int k) {
    final MultivariateMonomial copy = new MultivariateMonomial();
    copy.setCoefficient(getCoefficient());
    for (final Map.Entry<Pair<String, Integer>, Z> e : entrySet()) {
      copy.put(e.getKey(), e.getValue().multiply(k));
    }
    copy.mTotalDegree = mTotalDegree.multiply(k);
    return copy;
  }

  /**
   * Return a version of this monomial with relabeled variables.
   * @param a old variable name
   * @param b new variable name
   * @return relabeled monomial
   */
  public MultivariateMonomial relabel(final String a, final String b) {
    if (a.equals(b)) {
      return this;
    }
    final MultivariateMonomial copy = new MultivariateMonomial();
    copy.setCoefficient(getCoefficient());
    for (final Map.Entry<Pair<String, Integer>, Z> e : entrySet()) {
      final Pair<String, Integer> key = e.getKey();
      if (key.left().equals(a)) {
        copy.add(b, key.right(), e.getValue());
      } else {
        copy.put(key, e.getValue());
      }
    }
    copy.mTotalDegree = mTotalDegree;
    return copy;
  }

  /**
   * Evaluate this monomial using the given values as variable substitutions.
   * @param subs values for variables
   * @return evaluation of monomial
   */
  public Q eval(final long... subs) {
    Q prod = getCoefficient();
    for (final Map.Entry<Pair<String, Integer>, Z> e : entrySet()) {
      final int k = e.getKey().right();
      final long s = subs[k % subs.length];
      prod = prod.multiply(new Q(s).pow(e.getValue().intValueExact()));
      if (Q.ZERO.equals(prod)) {
        break; // efficiency
      }
    }
    return prod;
  }

  /**
   * Return the formal derivative of this multivariate monomial with respect
   * to the given variable.
   * @param var variable name
   * @param index variable index
   * @return derivative
   */
  public MultivariateMonomial diff(final String var, final int index) {
    final Pair<String, Integer> key = new Pair<>(var, index);
    final Z power = get(key);
    if (power == null) {
      return new MultivariateMonomial(); // zero
    }
    final MultivariateMonomial res = copy();
    res.mTotalDegree = res.mTotalDegree.subtract(1);
    res.mTermKey = null;
    if (power.equals(Z.ONE)) {
      res.remove(key);
    } else {
      res.put(key, power.subtract(1));
      res.multiply(new Q(power));
    }
    return res;
  }

  private static void appendTeX(final StringBuilder sb, final Z v) {
    if (v.compareTo(Z.TEN) < 0) {
      sb.append(v);
    } else {
      sb.append('{').append(v).append('}');
    }
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    final String c = mCoefficient.toString();
    if (c.contains("/")) {
      sb.append('(').append(c).append(')');
    } else if (!"1".equals(c) || size() == 0) {
      sb.append(c);
    }
    final ArrayList<String> terms = new ArrayList<>();
    for (final Map.Entry<Pair<String, Integer>, Z> e : entrySet()) {
      final StringBuilder sbt = new StringBuilder();
      final Pair<String, Integer> var = e.getKey();
      sbt.append(var.left()).append('_');
      appendTeX(sbt, Z.valueOf(var.right()));
      final Z power = e.getValue();
      if (!power.equals(Z.ONE)) {
        sbt.append('^');
        appendTeX(sbt, power);
      }
      terms.add(sbt.toString());
    }
    Collections.sort(terms);
    for (final String s : terms) {
      sb.append(s);
    }
    return sb.toString();
  }

  private List<Pair<String, Integer>> powerDescriptors(final MultivariateMonomial a, final MultivariateMonomial b) {
    final ArrayList<Pair<String, Integer>> desc = new ArrayList<>(a.keySet());
    desc.addAll(b.keySet());
    desc.sort((a1, b1) -> {
      final int c = a1.left().compareTo(b1.left());
      if (c != 0) {
        return c;
      }
      return a1.right().compareTo(b1.right());
    });
    return desc;
  }

  @Override
  public int compareTo(final MultivariateMonomial other) {
    final List<Pair<String, Integer>> desc = powerDescriptors(this, other);
    for (final Pair<String, Integer> key : desc) {
      final Z a = get(key);
      final Z b = other.get(key);
      final int c = (a == null ? Z.ZERO : a).compareTo(b == null ? Z.ZERO : b);
      if (c != 0) {
        return c;
      }
    }
    return getCoefficient().compareTo(other.getCoefficient());
  }

  @Override
  public boolean equals(final Object o) {
    return super.equals(o) && getCoefficient().equals(((MultivariateMonomial) o).getCoefficient());
  }

  @Override
  public int hashCode() {
    return super.hashCode() ^ getCoefficient().hashCode();
  }
}

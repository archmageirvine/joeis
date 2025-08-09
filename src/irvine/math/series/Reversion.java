package irvine.math.series;

import java.util.ArrayList;

import irvine.math.MemoryFunction1;
import irvine.math.api.Field;

/**
 * Cache the reversion of a series.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class Reversion<E> extends MemoryFunction1<E> implements Series<E> {

  private final Field<E> mElementField;
  private final Series<E> mS;
  private final ArrayList<E> mU = new ArrayList<>();

  Reversion(final Field<E> elementField, final Series<E> s) {
    // Lagrangian power series reversion, based on Knuth, Algorithm L in The Art of Computer Programming, Seminumerical Algorithms
    if (!elementField.isZero(s.coeff(0))) {
      throw new IllegalArgumentException("Expected " + elementField.zero() + " saw " + s.coeff(0));
    }
    if (s.bound() > 0 && !elementField.isOne(s.coeff(1))) {
      // Cf. A060041 for a Q version that supports non-unit t.coeff(1)
      // Cf. A123301 for a Polynomial<Q> version that supports non-unit t.coeff(1)
      throw new IllegalArgumentException("Expected " + elementField.one() + " saw " + s.coeff(1));
    }
    mElementField = elementField;
    mS = s;
    mU.add(mElementField.one());
  }

  @Override
  protected E compute(final int n) {
    if (n == 0) {
      return mElementField.zero();
    }
    if (n == 1) {
      return mElementField.one();
    }
    get(n - 1); // Ensures mU is correctly constructed
    for (int k = 1; k <= n - 2; ++k) {
      E uk = mElementField.zero();
      for (int j = 2; j <= Math.min(k + 1, mS.bound()); ++j) {
        uk = mElementField.add(uk, mElementField.multiply(mU.get(k + 1 - j), mS.coeff(j)));
      }
      mU.set(k, mElementField.subtract(mU.get(k), uk));
    }
    E un = mElementField.zero();
    for (int j = 2; j <= Math.min(n, mS.bound()); ++j) {
      un = mElementField.subtract(un, mElementField.multiply(mElementField.multiply(mU.get(n - j), mS.coeff(j)), mElementField.coerce(j)));
    }
    mU.add(un);
    assert mU.size() == n;
    return mElementField.divide(un, mElementField.coerce(n));
  }

  @Override
  public E coeff(final int n) {
    return get(n);
  }

  @Override
  public int bound() {
    return mS.bound();
  }
}

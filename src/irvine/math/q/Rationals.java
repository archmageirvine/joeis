package irvine.math.q;

import irvine.math.group.AbstractOrderedField;
import irvine.math.z.Z;
import irvine.util.AbstractIterator;

import java.util.Iterator;

/**
 * Field of rationals under addition and multiplication.
 * @author Sean A. Irvine
 */
public final class Rationals extends AbstractOrderedField<Q> {

  /** Field of rationals under addition and multiplication. */
  public static final Rationals SINGLETON = new Rationals();

  private Rationals() { }

  @Override
  public Q zero() {
    return Q.ZERO;
  }

  @Override
  public Q one() {
    return Q.ONE;
  }

  @Override
  public Q add(final Q a, final Q b) {
    return a.add(b);
  }

  @Override
  public Q subtract(final Q a, final Q b) {
    return a.subtract(b);
  }

  @Override
  public Q multiply(final Q a, final Q b) {
    return a.multiply(b);
  }

  @Override
  public Q pow(final Q a, final long n) {
    if (n > Integer.MAX_VALUE) {
      throw new UnsupportedOperationException();
    }
    return a.pow((int) n);
  }

  @Override
  public Q divide(final Q n, final Q d) {
    return n.divide(d);
  }

  @Override
  public Q negate(final Q a) {
    return a.negate();
  }

  @Override
  public Q inverse(final Q a) {
    return a.reciprocal();
  }

  @Override
  public Z size() {
    return null;
  }

  @Override
  public boolean contains(final Q element) {
    return element != null;
  }

  private static class RationalIterator extends AbstractIterator<Q> {
    @Override
    public boolean hasNext() {
      return true;
    }

    // Stern's diatomic series.  Successive ratios mA/mB runs through all
    // reduced rationals exactly once.  See A002487 in OEIS. 
    
    private Z mA = Z.ZERO;
    private Z mB = null;

    @Override
    public Q next() {
      if (mB == null) {
        mB = Z.ONE;
      } else {
        final Z t = mA.divide(mB).multiply2().add(1).multiply(mB).subtract(mA);
        mA = mB;
        mB = t;
      }
      return new Q(mA, mB);
    }
  }

  @Override
  public Iterator<Q> iterator() {
    return new RationalIterator();
  }

  @Override
  public boolean isCyclic() {
    return false;
  }

  @Override
  public String toString() {
    return "\\Q";
  }

  @Override
  public Z characteristic() {
    return Z.ZERO;
  }

  @Override
  public int compare(final Q a, final Q b) {
    return a.num().multiply(b.den()).compareTo(b.num().multiply(a.den()));
  }

  @Override
  public Q coerce(final long n) {
    return new Q(n);
  }
}

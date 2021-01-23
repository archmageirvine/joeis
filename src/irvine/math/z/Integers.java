package irvine.math.z;

import java.util.Iterator;

import irvine.math.api.Group;
import irvine.math.api.Pow;
import irvine.math.api.Sqrt;
import irvine.math.group.AbstractGroup;
import irvine.math.group.AbstractOrderedIntegralDomain;
import irvine.math.group.IntegerMultiples;
import irvine.util.AbstractIterator;

/**
 * Ring of integers under addition.
 * @author Sean A. Irvine
 */
public class Integers extends AbstractOrderedIntegralDomain<Z> implements Sqrt<Z>, Pow<Z> {

  /** Ring of integers under addition. */
  public static final Integers SINGLETON = new Integers();

  protected Integers() { }

  @Override
  public Z zero() {
    return Z.ZERO;
  }

  @Override
  public Z one() {
    return Z.ONE;
  }

  @Override
  public Z add(final Z a, final Z b) {
    return a.add(b);
  }

  @Override
  public Z subtract(final Z a, final Z b) {
    return a.subtract(b);
  }

  @Override
  public Z multiply(final Z a, final Z b) {
    return a.multiply(b);
  }

  @Override
  public Z pow(final Z a, final long n) {
    if (n > Integer.MAX_VALUE) {
      throw new UnsupportedOperationException();
    }
    return a.pow(n);
  }

  @Override
  public Z pow(final Z a, final Z n) {
    return a.pow(n.intValueExact());
  }

  @Override
  public Z negate(final Z a) {
    return a.negate();
  }

  @Override
  public Z size() {
    return null;
  }

  @Override
  public boolean isCyclic() {
    return true;
  }

  @Override
  public boolean contains(final Z element) {
    return element != null;
  }

  @Override
  public AbstractGroup<Z> subgroup(final Z element) {
    return new IntegerMultiples(element);
  }

  // Iterates like this 0, 1, -1, 2, -2, 3, -3, ...
  private static class IntegerIterator extends AbstractIterator<Z> {
    @Override
    public boolean hasNext() {
      return true;
    }

    private Z mN = null;

    @Override
    public Z next() {
      if (mN == null) {
        mN = Z.ZERO;
      } else if (mN.signum() > 0) {
        mN = mN.negate();
      } else {
        mN = mN.negate().add(1);
      }
      return mN;
    }
  }

  @Override
  public Iterator<Z> iterator() {
    return new IntegerIterator();
  }

  @Override
  public String toString() {
    return "\\Z";
  }

  @Override
  public Z sqrt(final Z n) {
    return n.sqrt();
  }

  @Override
  public Z ord(final Z element) {
    return one().equals(element) ? Z.ONE : null;
  }

  @Override
  public boolean equals(final Object other) {
    return super.equals(other);
  }

  @Override
  public int hashCode() {
    return 0x01234567;
  }

  @Override
  public Z index(final Group<Z> subgroup) {
    if (subgroup instanceof IntegerMultiples) {
      return ((IntegerMultiples) subgroup).multiple();
    }
    return super.index(subgroup);
  }

  @Override
  public Z characteristic() {
    return Z.ZERO;
  }

  @Override
  public int compare(final Z a, final Z b) {
    return a.compareTo(b);
  }

  @Override
  public Z coerce(final long n) {
    return Z.valueOf(n);
  }
}

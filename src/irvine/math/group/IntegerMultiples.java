package irvine.math.group;

import java.util.Iterator;

import irvine.math.api.Group;
import irvine.math.api.Set;
import irvine.math.z.Z;
import irvine.util.AbstractIterator;

/**
 * Group of all multiples of an integer under addition.
 * @author Sean A. Irvine
 */
public class IntegerMultiples extends AbstractGroup<Z> {

  private final Z mMultiple;

  /**
   * A group of the integer multiples.
   * @param mult multiplier
   */
  public IntegerMultiples(final Z mult) {
    if (mult == null) {
      throw new NullPointerException();
    }
    mMultiple = mult.abs();
  }

  /**
   * A group of the integer multiples.
   * @param mult multiplier
   */
  public IntegerMultiples(final long mult) {
    this(Z.valueOf(mult));
  }
  
  /**
   * Return the multiple associated with this group.
   * @return multiple
   */
  public Z multiple() {
    return mMultiple;
  }

  @Override
  public Z zero() {
    return Z.ZERO;
  }

  @Override
  public boolean contains(final Z element) {
    return element != null && element.mod(mMultiple).isZero();
  }

  @Override
  public Z add(final Z a, final Z b) {
    checkContains(a);
    checkContains(b);
    return a.add(b);
  }

  @Override
  public Z negate(final Z a) {
    checkContains(a);
    return a.negate();
  }

  @Override
  public Z size() {
    return mMultiple.isZero() ? Z.ONE : null;
  }

  @Override
  public Iterator<Z> iterator() {
    return new AbstractIterator<Z>() {
      @Override
      public boolean hasNext() {
        return true;
      }

      private Z mN = mMultiple.negate();

      @Override
      public Z next() {
        mN = mN.add(mMultiple);
        return mN;
      }
    };
  }

  @Override
  public boolean isAbelian() {
    return true;
  }

  @Override
  public boolean isSubgroup(final Set<Z> elements) {
    // Special check for this type of group can circumvent infinite effort
    if (elements instanceof IntegerMultiples && ((IntegerMultiples) elements).multiple().mod(multiple()).isZero()) {
      return true;
    }
    return super.isSubgroup(elements);
  }

  @Override
  public Z index(final Group<Z> subgroup) {
    if (subgroup instanceof IntegerMultiples) {
      // Simple solution exists in this situation
      if (!isSubgroup(subgroup)) {
        throw new IllegalArgumentException();
      }
      return ((IntegerMultiples) subgroup).multiple().divide(multiple());
    }
    return super.index(subgroup);
  }

  @Override
  public String toString() {
    return "(" + mMultiple + "\\Z,+)";
  }
}

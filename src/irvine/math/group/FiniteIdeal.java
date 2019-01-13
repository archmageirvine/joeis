package irvine.math.group;

import irvine.math.api.Ring;
import irvine.math.z.Z;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Explicit construction of an ideal from an element in a ring.
 * @author Sean A. Irvine
 * @param <T> Underlying type
 */
public class FiniteIdeal<T> extends AbstractRing<T> {

  private final Ring<T> mParent;
  private final T mElement;
  private final HashSet<T> mMembers = new HashSet<>();

  /**
   * Construct the ideal induced by an element of a ring.
   * @param element base element for ideal
   * @param parent parent ring
   * @throws UnsupportedOperationException if the underlying group is infinite.
   */
  public FiniteIdeal(final Ring<T> parent, final T element) {
    if (parent == null || element == null) {
      throw new NullPointerException();
    }
    // This implementation explicitly computes all the members, so
    // it cannot deal with infinite sets reliably.
    parent.abortOnInfinite();
    if (!parent.isCommutative()) {
      throw new UnsupportedOperationException();
    }
    mParent = parent;
    mElement = element;
    for (final T r : mParent) {
      mMembers.add(mParent.multiply(element, r));
    }
  }

  @Override
  public T zero() {
    return mParent.zero();
  }

  @Override
  public T one() {
    checkContains(mParent.one());
    return mParent.one();
  }

  @Override
  public Z size() {
    return Z.valueOf(mMembers.size());
  }

  @Override
  public boolean contains(final T a) {
    return mMembers.contains(a);
  }

  @Override
  public T add(final T a, final T b) {
    checkContains(a);
    checkContains(b);
    return mParent.add(a, b);
  }

  @Override
  public T multiply(final T a, final T b) {
    checkContains(a);
    checkContains(b);
    return mParent.multiply(a, b);
  }

  @Override
  public T negate(final T a) {
    checkContains(a);
    return mParent.negate(a);
  }

  @Override
  public Iterator<T> iterator() {
    return mMembers.iterator();
  }

  @Override
  public String toString() {
    return "(" + mElement + ")";
  }

  @Override
  public boolean isCommutative() {
    return true;
  }
}

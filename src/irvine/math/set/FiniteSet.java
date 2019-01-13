package irvine.math.set;

import irvine.math.z.Z;
import irvine.util.string.StringUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * A finite set backed by a <code>java.util.Set</code>.
 * @author Sean A. Irvine
 * @param <T> Underlying type
 */
public class FiniteSet<T> extends AbstractSet<T> {

  private final Set<T> mSet;

  /**
   * Construct a new set backed by <code>java.util.Set</code>.
   * @param set underlying set
   */
  public FiniteSet(final Set<T> set) {
    if (set == null) {
      throw new NullPointerException();
    }
    mSet = set;
  }

  /**
   * Construct a new set from an iterable.
   * @param elements the elements
   */
  public FiniteSet(final Iterable<T> elements) {
    mSet = new HashSet<>();
    for (final T e : elements) {
      mSet.add(e);
    }
  }

  /**
   * Construct a new set backed by <code>java.util.Set</code>.
   * @param elements the elements
   */
  @SuppressWarnings("unchecked")
  public FiniteSet(final T... elements) {
    this(Arrays.asList(elements));
  }

  @Override
  public Z size() {
    return Z.valueOf(mSet.size());
  }

  @Override
  public boolean contains(final T element) {
    return mSet.contains(element);
  }

  @Override
  public Iterator<T> iterator() {
    return mSet.iterator();
  }

  @Override
  public String toString() {
    if (isEmpty()) {
      return "\\emptyset";
    }
    return "\\{" + StringUtils.toString(this, ",") + "\\}";
  }
}

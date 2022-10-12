package irvine.math.group;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import irvine.math.api.Group;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * The derived subgroup (also called commutator subgroup) of a group.
 * This implementation is likely only useful for small finite groups.
 * @author Sean A. Irvine
 * @param <T> Underlying type
 */
class DerivedSubgroup<T> extends AbstractGroup<Pair<T, T>> {

  private final Group<T> mParent;
  private final Pair<T, T> mZero;
  private final Map<T, Pair<T, T>> mInv = new HashMap<>();

  /**
   * Construct the derived subgroup of a group.
   * @param parent parent group
   * @exception NullPointerException if parent group is null.
   */
  DerivedSubgroup(final Group<T> parent) {
    if (parent == null) {
      throw new NullPointerException();
    }
    mParent = parent;
    mZero = new Pair<>(parent.zero(), parent.zero());
    mInv.put(parent.zero(), mZero);
    // The derived group of any Abelian group is trivial
    if (!parent.isAbelian()) {
      if (parent.isInfinite()) {
        throw new UnsupportedOperationException();
      }
      for (final T g : mParent) {
        for (final T h : mParent) {
          final T f = mParent.add(mParent.add(mParent.add(mParent.negate(g), mParent.negate(h)), g), h);
          final Pair<T, T> p = new Pair<>(g, h);
          if (!mInv.containsKey(f)) {
            mInv.put(f, p);
          }
        }
      }
    }
  }

  @Override
  public Pair<T, T> zero() {
    return mZero;
  }

  @Override
  public Pair<T, T> add(final Pair<T, T> a, final Pair<T, T> b) {
    final T f = mParent.add(mParent.add(mParent.add(mParent.negate(a.left()), mParent.negate(a.right())), a.left()), a.right());
    final T g = mParent.add(mParent.add(mParent.add(mParent.negate(b.left()), mParent.negate(b.right())), b.left()), b.right());
    return mInv.get(mParent.add(f, g));
  }

  @Override
  public Pair<T, T> negate(final Pair<T, T> a) {
    return new Pair<>(a.right(), a.left());
  }

  @Override
  public boolean isAbelian() {
    return false;
  }

  @Override
  public Z size() {
    return Z.valueOf(mInv.size());
  }

  @Override
  public boolean contains(final Pair<T, T> element) {
    return mParent.contains(element.left()) && mParent.contains(element.right());
  }

  @Override
  public Iterator<Pair<T, T>> iterator() {
    return mInv.values().iterator();
  }
}

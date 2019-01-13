package irvine.math.group;

import irvine.math.api.Group;
import irvine.util.AbstractIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * An iterator applicable to any subgroup of a group.
 * @author Sean A. Irvine
 * @param <T> Underlying type
 */
class SubgroupIterator<T> extends AbstractIterator<T> {

  private final Group<T> mGroup;
  private final Iterator<T> mParentIterator;
  private T mNext = null;

  SubgroupIterator(final Group<T> group, final Iterator<T> parentIterator) {
    mGroup = group;
    mParentIterator = parentIterator;
  }

  private void update() {
    if (mNext == null) {
      while (mParentIterator.hasNext()) {
        final T t = mParentIterator.next();
        if (mGroup.contains(t)) {
          mNext = t;
          break;
        }
      }
    }
  }

  @Override
  public boolean hasNext() {
    update();
    return mNext != null;
  }

  @Override
  public T next() {
    update();
    if (mNext == null) {
      throw new NoSuchElementException();
    }
    final T r = mNext;
    mNext = null;
    return r;
  }
}

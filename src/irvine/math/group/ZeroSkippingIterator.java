package irvine.math.group;

import irvine.util.AbstractIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * An iterator supporting skipping a single element in another iterator.
 * @author Sean A. Irvine
 */
class ZeroSkippingIterator<T> extends AbstractIterator<T> {

  private final Iterator<T> mIt;
  private final T mZero;
  private T mElement = null;

  ZeroSkippingIterator(final Iterator<T> it, final T zero) {
    mIt = it;
    mZero = zero;
  }

  private void step() {
    while (mElement == null && mIt.hasNext()) {
      final T e = mIt.next();
      if (!mZero.equals(e)) {
        mElement = e;
        return;
      }
    }
  }

  @Override
  public boolean hasNext() {
    step();
    return mElement != null;
  }

  @Override
  public T next() {
    step();
    if (mElement == null) {
      throw new NoSuchElementException();
    }
    final T res = mElement;
    mElement = null;
    return res;
  }
}

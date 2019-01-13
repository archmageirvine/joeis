package irvine.math.group;

import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.z.Z;
import irvine.math.polynomial.CycleIndex;
import irvine.util.AbstractIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Group of a single element
 * @author Sean A. Irvine
 * @param <T> Underlying type
 */
public class Singleton<T> extends AbstractGroup<T> {

  private final T mElement;

  Singleton(final T e) {
    mElement = e;
  }

  @Override
  public T zero() {
    return mElement;
  }

  @Override
  public boolean isAbelian() {
    return true;
  }

  @Override
  public T add(final T a, final T b) {
    if ((a == mElement || a.equals(mElement))
        && (b == mElement || b.equals(mElement))) {
      return mElement;
    }
    throw new IllegalArgumentException();
  }

  @Override
  public T negate(final T a) {
    if (a == mElement || a.equals(mElement)) {
      return mElement;
    }
    throw new IllegalArgumentException();
  }

  @Override
  public Z size() {
    return Z.ONE;
  }

  @Override
  public boolean contains(final T element) {
    if (element == null) {
      return mElement == null;
    } else {
      return element.equals(mElement);
    }
  }

  @Override
  public Iterator<T> iterator() {
    return new AbstractIterator<T>() {

      private boolean mDone = false;

      @Override
      public boolean hasNext() {
        return !mDone;
      }

      @Override
      public T next() {
        if (!mDone) {
          mDone = true;
          return mElement;
        }
        throw new NoSuchElementException();
      }
    };
  }

  @Override
  public String toString() {
    return "{" + mElement + "}";
  }

  @Override
  public CycleIndex cycleIndex() {
    final CycleIndex ci = new CycleIndex("Z(S1)");
    final MultivariateMonomial m = new MultivariateMonomial();
    m.add(1, 1);
    ci.add(m);
    return ci;
  }
}

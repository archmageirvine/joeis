package irvine.math.group;

import irvine.math.api.Ring;
import irvine.math.api.Set;
import irvine.math.set.AbstractOperation;
import irvine.math.set.AbstractSet;
import irvine.math.z.Z;

import java.util.Iterator;

/**
 * Convert a ring multiplication into an operation.
 * @author Sean A. Irvine
 */
class RingBackedOperation<E> extends AbstractOperation<E> {

  private static final class SetMinusOneElement<E> extends AbstractSet<E> {

    private final Set<E> mParent;
    private final E mElement;

    private SetMinusOneElement(final Set<E> set, final E element) {
      if (!set.contains(element)) {
        throw new IllegalArgumentException();
      }
      mParent = set;
      mElement = element;
    }

    @Override
    public Z size() {
      final Z parentSize = mParent.size();
      return parentSize == null ? null : parentSize.subtract(1);
    }

    @Override
    public boolean contains(final E element) {
      return mParent.contains(element) && !element.equals(mElement);
    }

    @Override
    public Iterator<E> iterator() {
      return new ZeroSkippingIterator<>(mParent.iterator(), mElement);
    }
  }

  private final Ring<E> mRing;

  RingBackedOperation(final Ring<E> ring) {
    super(new SetMinusOneElement<>(ring, ring.zero()), true, ring.isCommutative());
    mRing = ring;
  }

  @Override
  public E op(final E a, final E b) {
    return mRing.multiply(a, b);
  }
}

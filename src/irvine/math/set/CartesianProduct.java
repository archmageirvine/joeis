package irvine.math.set;

import java.util.ArrayList;
import java.util.Iterator;

import irvine.math.api.Set;
import irvine.math.z.Z;
import irvine.util.AbstractIterator;
import irvine.util.Pair;

/**
 * Construct a set that is the Cartesian product of two other sets;
 * with elements comprising ordered pairs from the two sets.
 * @author Sean A. Irvine
 * @param <L> Left type
 * @param <R> Right type
 */
public class CartesianProduct<L, R> extends AbstractSet<Pair<L, R>> {

  private final Set<L> mSetLeft;
  private final Set<R> mSetRight;

  /**
   * Form Cartesian product of two sets.
   * @param left first set
   * @param right first set
   */
  public CartesianProduct(final Set<L> left, final Set<R> right) {
    if (left == null || right == null) {
      throw new IllegalArgumentException();
    }
    mSetLeft = left;
    mSetRight = right;
  }

  @Override
  public Z size() {
    if (mSetLeft.isEmpty() || mSetRight.isEmpty()) {
      return Z.ZERO;
    }
    if (mSetLeft.isInfinite() || mSetRight.isInfinite()) {
      return null;
    }
    return mSetLeft.size().multiply(mSetRight.size());
  }

  @Override
  public boolean contains(final Pair<L, R> element) {
    return mSetLeft.contains(element.left()) && mSetRight.contains(element.right());
  }

  private static final class RightFiniteCartesianProductIterator<L, R> extends AbstractIterator<Pair<L, R>> {
    private final Iterator<L> mIteratorLeft;
    private final Set<R> mSetRight;
    private Iterator<R> mIteratorRight = null;
    private L mCurrentLeft = null;

    private RightFiniteCartesianProductIterator(final Set<L> left, final Set<R> right) {
      mSetRight = right;
      mIteratorLeft = left.iterator();
    }

    @Override
    public boolean hasNext() {
      return (mIteratorLeft.hasNext() && !mSetRight.isEmpty())
        || (mIteratorRight != null && mIteratorRight.hasNext());
    }

    @Override
    public Pair<L, R> next() {
      if (mCurrentLeft == null || !mIteratorRight.hasNext()) {
        mCurrentLeft = mIteratorLeft.next();
        mIteratorRight = mSetRight.iterator();
      }
      return new Pair<>(mCurrentLeft, mIteratorRight.next());
    }
  }

  private static final class LeftFiniteCartesianProductIterator<L, R> extends AbstractIterator<Pair<L, R>> {
    private final Iterator<R> mIteratorRight;
    private final Set<L> mSetLeft;
    private Iterator<L> mIteratorLeft = null;
    private R mCurrentRight = null;

    private LeftFiniteCartesianProductIterator(final Set<L> left, final Set<R> right) {
      mSetLeft = left;
      mIteratorRight = right.iterator();
    }

    @Override
    public boolean hasNext() {
      // We only ever use this iterator when the right set is infinite
      //return (mIteratorRight.hasNext() && !mSetLeft.isEmpty())|| (mIteratorLeft != null && mIteratorLeft.hasNext());
      return true;
    }

    @Override
    public Pair<L, R> next() {
      if (mCurrentRight == null || !mIteratorLeft.hasNext()) {
        mCurrentRight = mIteratorRight.next();
        mIteratorLeft = mSetLeft.iterator();
      }
      return new Pair<>(mIteratorLeft.next(), mCurrentRight);
    }
  }

  private static final class DovetailCartesianProductIterator<L, R> extends AbstractIterator<Pair<L, R>> {
    private final Set<R> mSetRight;
    private final Iterator<L> mIteratorLeft;
    private final ArrayList<L> mLeftElements = new ArrayList<>();
    private final ArrayList<Iterator<R>> mRightIterators = new ArrayList<>();
    private int mListPos = -1;

    private DovetailCartesianProductIterator(final Set<L> left, final Set<R> right) {
      mIteratorLeft = left.iterator();
      mSetRight = right;
    }

    @Override
    public boolean hasNext() {
      // We only ever use this iterator for infinite sets
      return true;
    }

    @Override
    public Pair<L, R> next() {
      if (++mListPos == mLeftElements.size()) {
        // We have reached the end of the current diagonal, extend the
        // left elements one further.
        mLeftElements.add(mIteratorLeft.next());
        mRightIterators.add(mSetRight.iterator());
        mListPos = 0;
      }
      return new Pair<>(mLeftElements.get(mListPos), mRightIterators.get(mListPos).next());
    }
  }

  @Override
  public Iterator<Pair<L, R>> iterator() {
    // The choice of iterator here depends on the countability of the sets
    // in the product.  The aim is for a fair result, in the sense that,
    // every pair will eventually appear in the list.
    if (!mSetRight.isInfinite()) {
      return new RightFiniteCartesianProductIterator<>(mSetLeft, mSetRight);
    } else if (!mSetLeft.isInfinite()) {
      return new LeftFiniteCartesianProductIterator<>(mSetLeft, mSetRight);
    } else {
      return new DovetailCartesianProductIterator<>(mSetLeft, mSetRight);
    }
  }

  @Override
  public String toString() {
    return mSetLeft + "\\times" + mSetRight;
  }
}

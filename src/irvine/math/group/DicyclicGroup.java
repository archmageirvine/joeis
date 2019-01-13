package irvine.math.group;

import java.util.Iterator;
import java.util.NoSuchElementException;

import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * The dicyclic groups.
 * @author Sean A. Irvine
 */
public class DicyclicGroup extends AbstractGroup<Pair<Integer, Integer>> {

  private final int mIndex;
  private final Z mSize;
  private final int mLim;
  private final Pair<Integer, Integer> mZero = new Pair<>(0, 0);

  /**
   * Construct the dicyclic group of specified index
   * @param n index of group (order is four times this number)
   */
  public DicyclicGroup(final int n) {
    mIndex = n;
    mLim = 2 * n;
    mSize = Z.FOUR.multiply(n);
  }

  @Override
  public Z size() {
    return mSize;
  }

  @Override
  public boolean contains(final Pair<Integer, Integer> element) {
    return element.left() >= 0 && element.left() < 2 * mIndex && element.right() >= 0 && element.right() <= 1;
  }

  private static final class DicyclicIterator implements Iterator<Pair<Integer, Integer>> {
    private final int mSize;
    private int mCount = -1;

    private DicyclicIterator(final int size) {
      mSize = size;
    }

    @Override
    public boolean hasNext() {
      return mCount < mSize - 1;
    }

    @Override
    public Pair<Integer, Integer> next() {
      if (++mCount >= mSize) {
        throw new NoSuchElementException();
      }
      return new Pair<>(mCount >>> 1, mCount & 1);
    }
  }

  @Override
  public Iterator<Pair<Integer, Integer>> iterator() {
    return new DicyclicIterator(mSize.intValueExact());
  }

  @Override
  public Pair<Integer, Integer> zero() {
    return mZero;
  }

  @Override
  public Pair<Integer, Integer> add(final Pair<Integer, Integer> a, final Pair<Integer, Integer> b) {
    checkContains(a);
    checkContains(b);
    if (a.right() == 0) {
      return new Pair<>((a.left() + b.left()) % mLim, b.right());
    } else if (b.right() == 0) {
      return new Pair<>((mLim + a.left() - b.left()) % mLim, 1);
    } else {
      return new Pair<>((mLim + a.left() - b.left() + mIndex) % mLim, 0);
    }
  }

  @Override
  public Pair<Integer, Integer> negate(final Pair<Integer, Integer> a) {
    return new Pair<>(mIndex - a.left(), a.right());
  }

  @Override
  public boolean isAbelian() {
    return false;
  }

  @Override
  public String toString() {
    return "\\mbox{Dic}_{" + mIndex + "}";
  }
}

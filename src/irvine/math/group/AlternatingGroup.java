package irvine.math.group;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;

import irvine.math.api.Set;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.set.IntegerSet;
import irvine.math.set.Permutation;
import irvine.math.z.Z;
import irvine.util.AbstractIterator;

/**
 * Alternating group on a finite set. That is, even composition of permutations.
 * In the operation <code>add(a, b)</code> the permutation <code>a</code>
 * is applied first.
 * @author Sean A. Irvine
 * @param <T> Underlying type
 */
public class AlternatingGroup<T> extends AbstractGroup<Permutation<T>> {

  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();

  /**
   * Construct the alternating group of order <code>n</code> on the integers
   * 1 to n inclusive.
   * @param n order
   * @return symmetric group
   */
  public static AlternatingGroup<Integer> create(final int n) {
    if (n < 1) {
      throw new IllegalArgumentException();
    }
    return new AlternatingGroup<>(new IntegerSet(1, n), "A_{" + n + "}");
  }

  private final Set<T> mSet;
  private final Permutation<T> mZero;
  private final Z mSize;
  private final String mName;

  private AlternatingGroup(final Set<T> set, final String name) {
    if (set.isInfinite() || set.size().isZero()) {
      throw new IllegalArgumentException();
    }
    mSet = set;
    mName = name;
    mZero = new Permutation<>(set, new HashMap<>());
    mSize = FACTORIAL.factorial(mSet.size()).divide2();
  }

  /**
   * Create an alternating group on the specified set.
   * @param set set of elements
   */
  public AlternatingGroup(final Set<T> set) {
    this(set, "A(" + set + ")");
  }

  @Override
  public Permutation<T> zero() {
    return mZero;
  }

  @Override
  public Z size() {
    return mSize;
  }

  @Override
  public boolean isAbelian() {
    return mSet.size().compareTo(Z.THREE) <= 0;
  }

  @Override
  public boolean isSimple() {
    return mSet.size().equals(Z.THREE) || mSet.size().compareTo(Z.FIVE) >= 0;
  }

  @Override
  public boolean contains(final Permutation<T> a) {
    return a != null && a.domain().equals(mSet) && (a == mZero || a.isEven() && SymmetricGroup.isValid(mSet, a));
  }

  @Override
  public Permutation<T> add(final Permutation<T> a, final Permutation<T> b) {
    checkContains(a);
    checkContains(b);
    final HashMap<T, T> r = new HashMap<>();
    for (final T e : a.domain()) {
      r.put(e, b.image(a.image(e)));
    }
    return new Permutation<>(mSet, r);
  }

  @Override
  public Permutation<T> negate(final Permutation<T> a) {
    checkContains(a);
    final HashMap<T, T> r = new HashMap<>();
    for (final T e : a.domain()) {
      r.put(a.image(e), e);
    }
    return new Permutation<>(mSet, r);
  }

  private static final class AlternatingGroupIterator<T> extends AbstractIterator<Permutation<T>> {
    private final Set<T> mSet;
    private final ArrayList<T> mElements;
    private final Z mSize;
    private final irvine.util.Permutation mPerm;
    private Z mCount = Z.ZERO;

    private AlternatingGroupIterator(final Set<T> set, final Z size) {
      mSet = set;
      mElements = new ArrayList<>();
      for (final T e : set) {
        mElements.add(e);
      }
      mPerm = new irvine.util.Permutation(mElements.size());
      mSize = size;
    }

    @Override
    public boolean hasNext() {
      return mCount.compareTo(mSize) < 0;
    }

    @Override
    public Permutation<T> next() {
      while (true) {
        final int[] p = mPerm.next();
        if (p == null) {
          throw new NoSuchElementException();
        }
        final HashMap<T, T> r = new HashMap<>();
        for (int k = 0; k < mElements.size(); ++k) {
          r.put(mElements.get(k), mElements.get(p[k]));
        }
        final Permutation<T> perm = new Permutation<>(mSet, r);
        if (perm.isEven()) {
          mCount = mCount.add(1);
          return perm;
        }
      }
    }
  }

  @Override
  public Iterator<Permutation<T>> iterator() {
    return new AlternatingGroupIterator<>(mSet, size());
  }

  @Override
  public String toString() {
    return mName;
  }

  static CycleIndex cycleIndex(final int size) {
    final CycleIndex ci = new CycleIndex("Z(A" + size + ")");
    final IntegerPartition ip = new IntegerPartition(size);
    final int[] a = new int[size + 1];
    int[] p;
    while ((p = ip.next()) != null) {
      IntegerPartition.toCountForm(p, a);
      int s = 0;
      for (int k = 2; k < a.length; k += 2) {
        s += a[k];
      }
      if ((s & 1) == 0) {
        final MultivariateMonomial mm = new MultivariateMonomial();
        for (int k = 1; k < a.length; ++k) {
          if (a[k] > 0) {
            mm.add(k, a[k]);
          }
        }
        mm.setCoefficient(new Q(Z.TWO, SymmetricGroup.per(a)));
        ci.add(mm);
      }
    }
    return ci;
  }

  @Override
  public CycleIndex cycleIndex() {
    return cycleIndex(mSet.size().intValueExact());
  }
}

package irvine.math.group;

import irvine.math.api.Ring;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Compute factorials in a ring and remember their values.
 *
 * @author Sean A. Irvine
 * @param <E> underlying element type
 */
public final class RingFactorial<E> {

  // Singleton cache, this is all quite complicated with generics
  private static final HashMap<Class<?>, RingFactorial<?>> INSTANCES = new HashMap<>();

  /**
   * Return a factorial computer for the specified ring.
   * @param ring underlying in which to compute factorials
   * @param <E> element type
   * @return factorial computer
   */
  @SuppressWarnings("unchecked")
  public static <E> RingFactorial<E> instance(final Ring<E> ring) {
    final Class<?> clazz = ring.getClass();
    if (INSTANCES.containsKey(clazz)) {
      return (RingFactorial<E>) INSTANCES.get(clazz);
    } else {
      final RingFactorial<E> instance = new RingFactorial<>(ring);
      INSTANCES.put(clazz, instance);
      return instance;
    }
  }

  private final Ring<E> mRing;
  private final ArrayList<E> mF = new ArrayList<>();
  private E mNext;

  /**
   * Construct a new factorial computer over the specified ring.
   * @param ring the ring
   */
  private RingFactorial(final Ring<E> ring) {
    mRing = ring;
    mF.add(ring.one());
    mNext = ring.one();
  }

  /**
   * Factorial in given ring.  Roughly speaking the product of the
   * first <code>n</code> numbers in the ring.
   * @param n element number
   * @return <code>n!</code> in the ring
   */
  public E factorial(final int n) {
    if (n < 0) {
      throw new IllegalArgumentException("n must be nonnegative");
    }
    if (n < mF.size()) {
      return mF.get(n);
    }
    int k = mF.size() - 1;
    E f = mF.get(k);
    while (++k <= n) {
      f = mRing.multiply(f, mNext);
      mF.add(f);
      mNext = mRing.add(mNext, mRing.one());
    }
    return f;
  }
}

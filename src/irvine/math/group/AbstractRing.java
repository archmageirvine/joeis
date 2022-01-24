package irvine.math.group;

import java.util.function.Function;

import irvine.factor.factor.Cheetah;
import irvine.math.api.Operation;
import irvine.math.api.Ring;
import irvine.math.api.Set;
import irvine.math.set.EffortException;
import irvine.math.z.Z;

/**
 * Default implementation of certain ring methods.
 * @author Sean A. Irvine
 * @param <E> underlying element type
 */
public abstract class AbstractRing<E> extends AbstractGroup<E> implements Ring<E> {

  /**
   * Powering. Computes <code>b^n</code>. Made available as a static so it
   * can be called in cases where it is impossible to be an instance of this
   * class
   * @param ring the base ring
   * @param b base
   * @param n n
   * @param <E> element type
   * @return <code>b^n</code>
   * @exception ArithmeticException if <code>n</code> is negative
   * and power would entail a non-integral result.
   */
  public static <E> E pow(final Ring<E> ring, final E b, final long n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    // x^0
    if (n == 0) {
      return ring.one();
    }
    // 0^x, 1^x, cannot use .equals() because of CR type
    if (b == ring.zero() || b == ring.one()) {
      return b;
    }
    // x^1
    if (n == 1) {
      return b;
    }
    // x^2 (this case for efficiency)
    if (n == 2) {
      return ring.multiply(b, b);
    }
    final E s = pow(ring, ring.multiply(b, b), n / 2);
    return (n & 1) == 0 ? s : ring.multiply(s, b);
  }

  // The group inside a ring is always Abelian
  @Override
  public boolean isAbelian() {
    return true;
  }

  @Override
  public abstract E one();

  @Override
  public abstract E multiply(final E a, final E b);

  @Override
  public E pow(final E a, final long n) {
    return pow(this, a, n);
  }

  static <E> Z ord(final Ring<E> ring, final E element) {
    Z order = Z.ONE;
    E v = element;
    while (!ring.one().equals(v)) {
      order = order.add(1);
      v = ring.multiply(v, element);
    }
    return order;
  }

  @Override
  public Z ord(final E element) {
    return ord(this, element);
  }

  private static <E> E solveZeroDivisor(final Ring<E> ring, final E element) {
    if (ring.zero().equals(element)) {
      throw new ArithmeticException();
    }
    final long effort = ring.getInfiniteEffort();
    final E zero = ring.zero();
    long k = 0;
    for (final E a : ring) {
      if (!zero.equals(a)) {
        if (zero.equals(ring.multiply(element, a))) {
          return a;
        }
        if (ring.isInfinite() && ++k == effort) {
          throw new EffortException();
        }
      }
    }
    return null;
  }
  
  static <E> E isZeroDivisor(final Ring<E> ring, final E element) {
    if (ring.isIntegralDomain()) {
      return null;
    }
    return solveZeroDivisor(ring, element);
  }
  
  /**
   * Explicit test for an integral domain by testing individual elements.
   * In most cases there are theoretical or other tests that can give a
   * quicker answer.
   * @param <E> element type
   * @param ring ring to test
   * @return true iff this ring is an integral domain
   */
  static <E> boolean isIntegralDomain(final Ring<E> ring) {
    if (!ring.isCommutative()) {
      return false;
    }
    // Try and find a zero divisor.  For finite rings this will definitely
    // give the answer eventually.  For infinite rings we can only ever
    // get a negative answer from this procedure.
    final E zero = ring.zero();
    for (final E a : ring) {
      if (!zero.equals(a)) {
        if (solveZeroDivisor(ring, a) != null) {
          return false;
        }
      }
    }
    return true;
  }

  // Remember if we are an integral domain because determination can
  // be costly.
  private Boolean mIsIntegralDomainCache = null;
  
  @Override
  public boolean isIntegralDomain() {
    if (mIsIntegralDomainCache == null) {
      mIsIntegralDomainCache = isIntegralDomain(this);
    }
    return mIsIntegralDomainCache;
  }

  @Override
  public E isZeroDivisor(final E element) {
    return isZeroDivisor(this, element);
  }

  static <E> Z characteristic(final Ring<E> ring) {
    final E zero = ring.zero();
    final E one = ring.one();
    // Note even finite rings can never reach 0
    final long effort = ring.getInfiniteEffort();
    long characteristic = 0;
    E element = zero;
    do {
      element = ring.add(element, one);
      if (++characteristic == effort) {
        throw new EffortException();
      }
    } while (!zero.equals(element));
    return Z.valueOf(characteristic);
  }

  @Override
  public Z characteristic() {
    return characteristic(this);
  }


  static <E> boolean isSubring(final Ring<E> ring, final Set<E> elements) {
    if (elements == ring) {
      return true;
    }
    if (!ring.isSubgroup(elements)) {
      return false;
    }
    // Check multiplicative closure
    final Z size = elements.size();
    long k = 0;
    for (final E e : elements) {
      for (final E f : elements) {
        if (!elements.contains(ring.multiply(e, f))) {
          return false;
        }
        if (size == null && ++k == ring.getInfiniteEffort()) {
          throw new EffortException();
        }
      }
    }
    return true;
  }

  @Override
  public boolean isSubring(final Set<E> elements) {
    return isSubring(this, elements);
  }

  static <E> boolean isIdeal(final Ring<E> ring, final Set<E> elements) {
    if (!isSubring(ring, elements)) {
      return false;
    }
    final boolean infinite = elements.size() == null || ring.size() == null;
    long k = 0;
    for (final E e : elements) {
      for (final E f : ring) {
        if (!elements.contains(ring.multiply(e, f))) {
          return false;
        }
        if (infinite && ++k == ring.getInfiniteEffort()) {
          throw new EffortException();
        }
      }
    }
    if (!ring.isCommutative()) {
      for (final E e : elements) {
        for (final E f : ring) {
          if (!elements.contains(ring.multiply(f, e))) {
            return false;
          }
          if (infinite && ++k == ring.getInfiniteEffort()) {
            throw new EffortException();
          }
        }
      }
    }
    return true;
  }

  @Override
  public boolean isIdeal(final Set<E> elements) {
    return isIdeal(this, elements);
  }

  @Override
  public Ring<Set<E>> quotientRing(final Ring<E> ideal) {
    return new QuotientRing<>(this, ideal);
  }

  @Override
  public Ring<E> ideal(final E element) {
    return new FiniteIdeal<>(this, element);
  }

  @Override
  public Operation<E> multiplicativeOperation() {
    return new RingBackedOperation<>(this);
  }

  @Override
  public E conjugate(final E element) {
    return element;
  }

  /**
   * The sum of a function from lo to hi inclusive.
   * @param lo lower bound
   * @param hi upper bound
   * @param function the function
   * @return sum
   */
  public E sum(final int lo, final int hi, final Function<Integer, E> function) {
    E sum = zero();
    for (int k = lo; k <= hi; ++k) {
      sum = add(sum, function.apply(k));
    }
    return sum;
  }

  /**
   * The sum of a function over all the divisors of a number.
   * @param n sum over the divisors of this number
   * @param function the function
   * @return sum
   */
  public E sumdiv(final int n, final Function<Integer, E> function) {
    E sum = zero();
    for (final Z d : Cheetah.factor(n).divisors()) {
      sum = add(sum, function.apply(d.intValueExact()));
    }
    return sum;
  }
}

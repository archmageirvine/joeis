package irvine.oeis;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

import irvine.math.z.Z;

/**
 * A sequence supporting caching of computed values.  This kind of sequence is
 * appropriate when values are likely to be reused (e.g., in computing larger
 * terms) and where the re-computation of those values is likely to be more
 * expensive than consulting previously computed values.
 *
 * It also supports direct access to arbitrary sequence values through the
 * <code>a(int)</code> and <code>a(Z)</code> methods of <code>DirectSequence</code>.
 *
 * The sequence can be constructed by either:
 *
 * (a) providing a lambda capable of computing a requested term, or
 * (b) overriding the <code>compute</code> method.
 *
 * The lambda is given a reference to this sequence, so that it can refer to
 * previously computed terms (e.g., via <code>self.a(k)</code>) and the
 * index at which the function is to be evaluated.  The lambda can be
 * written in terms of <code>Integer</code>, <code>Long></code>, or
 * <code>Z</code> arguments.
 *
 * For example, Fibonacci numbers done with this approach could be:
 * <code>
 *   new CachedSequence(0, Integer.class,
 *     (self, n) -> n <= 1 ? Z.valueOf(n) : self.a(n - 1).add(self.a(n - 2)));
 * </code>
 *
 * The index variable <code>n</code> is always with respect to the sequence
 * <code>offset</code>.
 *
 * @author Sean A. Irvine
 */
public class CachedSequence extends AbstractSequence implements DirectSequence {

  private final Map<Z, Z> mCache = new HashMap<>(); // stores previously computed terms
  private final BiFunction<DirectSequence, Z, Z> mSelfLambda; // lambda expression (this, n) -> f(n)
  private int mN; // current index for next()

  /**
   * Construct the sequence backed by a lambda function including a self reference.
   * @param offset first index
   * @param lambda lambda expression for an index variable starting at <code>offset</code>.
   */
  public CachedSequence(final int offset, final BiFunction<DirectSequence, Z, Z> lambda) {
    super(offset);
    mN = offset - 1;
    mSelfLambda = lambda;
  }

  /**
   * Construct the sequence backed by a lambda function.
   * @param offset first index
   * @param clazz type of the argument of the lambda function (one of <code>Integer</code>,
   * <code>Long</code>, or <code>Z</code>)
   * @param lambda lambda expression for an index variable starting at <code>offset</code>
   * @param <T> type of the lambda
   */
  @SuppressWarnings("unchecked")
  public <T> CachedSequence(final int offset, final Class<T> clazz, final BiFunction<DirectSequence, T, Z> lambda) {
    super(offset);
    mN = offset - 1;
    if (clazz.equals(Z.class)) {
      mSelfLambda = (BiFunction<DirectSequence, Z, Z>) lambda;
    } else if (clazz.equals(Integer.class)) {
      mSelfLambda = (self, n) -> ((BiFunction<DirectSequence, Integer, Z>) lambda).apply(self, n.intValueExact());
    } else if (clazz.equals(Long.class)) {
      mSelfLambda = (self, n) -> ((BiFunction<DirectSequence, Long, Z>) lambda).apply(self, n.longValueExact());
    } else {
      throw new IllegalArgumentException("Class: " + clazz.getName() + " not supported");
    }
  }

  /**
   * Construct the sequence without a lambda.  If this constructor is used,
   * then the <code>compute</code> method must be overridden to provide the
   * mechanism for computing terms of the sequence.
   * @param offset first index
   */
  protected CachedSequence(final int offset) {
    this(offset, null);
  }

  /**
   * Method providing for the actual computation of a sequence value.  By default,
   * will use a lambda provided at the time the sequence was constructed, but
   * if necessary, can be overridden in more complex situations.
   * This method should NOT be used to access terms of the sequence, call
   * <code>a(n)</code> instead.
   * @param n term index
   * @return value of sequence at index <code>n</code>
   */
  protected Z compute(final Z n) {
    return mSelfLambda.apply(this, n);
  }

  @Override
  public Z a(final Z n) {
    // It would be nice to do the following, but this doesn't work because
    // "this::compute" can trigger recursive computations resulting in a
    // ConcurrentModificationException
    //return mCache.computeIfAbsent(n, this::compute);

    // So instead ...

    final Z res = mCache.get(n);
    if (res != null) {
      return res;
    }
    final Z r = compute(n);
    mCache.put(n, r);
    return r;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

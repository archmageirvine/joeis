package irvine.math.set;

import irvine.math.api.Operation;
import irvine.math.api.Set;
import irvine.util.Pair;

/**
 * Default implementation of some operation related methods.
 *
 * @author Sean A. Irvine
 * @param <S> domain of definition
 */
public abstract class AbstractOperation<S> extends AbstractFunction<Pair<S, S>, S> implements Operation<S> {

  private final boolean mIsAssociative;
  private final boolean mIsCommutative;

  /**
   * An operation on a set.  It is possible to supply nonsense values for
   * associative or commutative properties provided the corresponding
   * methods are over-ridden in the subclass.
   * @param domain the set
   * @param associative true if operation is associative
   * @param commutative true if operation is commutative
   */
  public AbstractOperation(final Set<S> domain, final boolean associative, final boolean commutative) {
    super(new CartesianProduct<>(domain, domain), domain);
    mIsAssociative = associative;
    mIsCommutative = commutative;
  }

  @Override
  public S image(final Pair<S, S> x) {
    return op(x.left(), x.right());
  }

  @Override
  public boolean isAssociative() {
    return mIsAssociative;
  }

  @Override
  public boolean isCommutative() {
    return mIsCommutative;
  }

  @Override
  public boolean isIdentity(final S e) {
    // Test e itself first, often gives a quick exit
    if (!e.equals(op(e, e))) {
      return false;
    }
    final boolean infiniteDomain = domain().isInfinite();
    final long effort = getInfiniteEffort();
    long k = 0;
    final boolean commutative = isCommutative();
    for (final S a : codomain()) {
      if (!a.equals(op(a, e))) {
        return false;
      }
      if (!commutative && !a.equals(op(e, a))) {
        return false;
      }
      if (infiniteDomain && ++k == effort) {
        // Didn't find a counter-example within effort limit
        throw new EffortException();
      }
    }
    return true;
  }
}

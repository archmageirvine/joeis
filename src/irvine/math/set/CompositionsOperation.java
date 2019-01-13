package irvine.math.set;

import irvine.math.api.Function;
import irvine.math.api.Set;
import irvine.math.z.Z;

/**
 * The operation of function composition over a set.
 *
 * @author Sean A. Irvine
 * @param <S> underlying set
 */
public class CompositionsOperation<S> extends AbstractOperation<Function<S, S>> {

  /**
   * Compositions on all functions over the given set.
   * @param domain the set
   */
  public CompositionsOperation(final Set<S> domain) {
    super(new FunctionSet<>(domain, domain), true, Z.ONE.equals(domain.size()));
  }

  /**
   * Compositions on a set.
   * @param set the set of functions
   * @param associative true if operation is associative
   * @param commutative true if operation is commutative
   */
  public CompositionsOperation(final Set<Function<S, S>> set, final boolean associative, final boolean commutative) {
    super(set, associative, commutative);
  }

  @Override
  public Function<S, S> op(final Function<S, S> a, final Function<S, S> b) {
    return Composition.compose(a, b);
  }

}

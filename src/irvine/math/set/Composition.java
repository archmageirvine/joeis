package irvine.math.set;

import irvine.math.api.Function;
import irvine.math.api.Set;

/**
 * A function that is the composition of two other functions.
 *
 * @author Sean A. Irvine
 * @param <D> domain element type
 * @param <M> linking type
 * @param <R> codomain element type
 */
public final class Composition<D, M, R> extends AbstractFunction<D, R> {

  /**
   * The composition <code>beta(alpha(n))</code>.
   * @param alpha first function
   * @param beta second function
   * @param <D> domain element type
   * @param <M> linking type
   * @param <R> codomain element type
   * @return composite function
   */
  @SuppressWarnings("unchecked")
  public static <D, M, R> Function<D, R> compose(final Function<D, M> alpha, final Function<M, R> beta) {
    if (alpha instanceof IdentityFunction<?>) {
      return (Function<D, R>) beta;
    }
    if (beta instanceof IdentityFunction<?>) {
      return (Function<D, R>) alpha;
    }
    return new Composition<>(alpha, beta);
  }

  private final Function<D, M> mAlpha;
  private final Function<M, R> mBeta;

  private Composition(final Function<D, M> alpha, final Function<M, R> beta) {
    super(alpha.domain(), beta.codomain());
    mAlpha = alpha;
    mBeta = beta;
  }

  @Override
  public R image(final D x) {
    return mBeta.image(mAlpha.image(x));
  }

  @Override
  public Set<R> image() {
    return mBeta.image(mAlpha.image());
  }

  @Override
  public boolean isOnto() {
    return mAlpha.isOnto() && mBeta.isOnto();
  }

  @Override
  public boolean isOneToOne() {
    return mAlpha.isOneToOne() && mBeta.isOneToOne();
  }

}

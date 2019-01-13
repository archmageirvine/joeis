package irvine.math.polynomial;

/**
 * An operation applicable to multivariate monomials.
 * @author Sean A. Irvine
 */
public interface MultivariateMonomialOperation {

  // It might have been possible to extend irvine.math.api.Operation here,
  // but that would require more baggage than needed.

  /**
   * Define an operation on multivariate monomials.
   * @param alpha first multivariate monomial
   * @param beta second multivariate monomial
   * @return result of operation
   */
  MultivariateMonomial op(final MultivariateMonomial alpha, final MultivariateMonomial beta);

}

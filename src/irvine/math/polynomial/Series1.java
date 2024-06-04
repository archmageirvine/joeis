package irvine.math.polynomial;

import irvine.math.q.Q;

/**
 * Methods for accessing a rational polynomial series.
 * @author Sean A. Irvine
 */
public interface Series1 {

  /**
   * Return a rational polynomial series up to at least the specified degree.
   * @param minDegree the minimum degree of the returned expansion
   * @return polynomial series for the function
   */
  Polynomial<Q> s(int minDegree);

  /**
   * Return a rational polynomial series up to at least the specified degree.
   * @param minDegree the minimum degree of the returned expansion
   * @param z polynomial to substitute in as the argument
   * @return polynomial series for the function
   */
  Polynomial<Q> s(int minDegree, Polynomial<Q> z);

  /**
   * Return a coefficient from rational polynomial series.
   * @param n coefficient index
   * @return coefficient
   */
  Q c(int n);
}

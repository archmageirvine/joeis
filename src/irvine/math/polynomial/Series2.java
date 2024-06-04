package irvine.math.polynomial;

import irvine.math.q.Q;

/**
 * Methods for accessing a parameterized rational polynomial series.
 * @author Sean A. Irvine
 */
public interface Series2 {

  /**
   * Return a rational polynomial series up to at least the specified degree.
   * @param v parameter of the function
   * @param minDegree the minimum degree of the returned expansion
   * @return polynomial series for the function
   */
  Polynomial<Q> s(long v, int minDegree);

  /**
   * Return a rational polynomial series up to at least the specified degree.
   * @param v parameter of the function
   * @param minDegree the minimum degree of the returned expansion
   * @param z polynomial to substitute in as the argument
   * @return polynomial series for the function
   */
  Polynomial<Q> s(long v, int minDegree, Polynomial<Q> z);

  /**
   * Return a coefficient from rational polynomial series.
   * @param v parameter of the function
   * @param n coefficient index
   * @return coefficient
   */
  Q c(long v, int n);
}

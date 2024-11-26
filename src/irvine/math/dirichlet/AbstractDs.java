package irvine.math.dirichlet;

import irvine.math.z.Z;

/**
 * Dirichlet series.
 * @author Sean A. Irvine
 */
public abstract class AbstractDs implements Ds {

  /**
   * Return the coefficient associated with <code>n^(-s)</code> in the Dirichlet series.
   * @param n coefficient index.
   * @return coefficient
   */
  public abstract Z coeff(final Z n);

  /**
   * Return the coefficient associated with <code>n^(-s)</code> in the Dirichlet series.
   * @param n coefficient index.
   * @return coefficient
   */
  public Z coeff(final long n) {
    return coeff(Z.valueOf(n));
  }
}

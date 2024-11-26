package irvine.math.dirichlet;

import java.util.HashMap;

import irvine.math.z.Z;

/**
 * Dirichlet series backed by a map.
 * @author Sean A. Irvine
 */
class FiniteDs extends HashMap<Z, Z> implements Ds {

  @Override
  public Z coeff(final Z n) {
    return getOrDefault(n, Z.ZERO);
  }

  @Override
  public Z coeff(final long n) {
    return coeff(Z.valueOf(n));
  }
}

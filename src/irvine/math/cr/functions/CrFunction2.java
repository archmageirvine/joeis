package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * Defines a two argument real valued function.
 * @author Sean A. Irvine
 */
public abstract class CrFunction2 {

  /**
   * Evaluate the function at the given value.
   * @param v index
   * @param z parameter
   * @return function value
   */
  public abstract CR cr(final int v, final CR z);

  /**
   * Evaluate the function at an integer value.
   * @param v index
   * @param z parameter
   * @return function value
   */
  public CR cr(final int v, final Z z) {
    return cr(v, CR.valueOf(z));
  }

}

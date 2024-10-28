package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * Defines a one argument real valued function.
 * @author Sean A. Irvine
 */
public abstract class CrFunction1 {

  /**
   * Evaluate the function at the given value.
   * @param z parameter
   * @return function value
   */
  public abstract CR cr(final CR z);

  /**
   * Evaluate the function at an integer value.
   * @param z parameter
   * @return function value
   */
  public CR cr(final Z z) {
    return cr(CR.valueOf(z));
  }

}

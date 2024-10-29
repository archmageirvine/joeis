package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Defines a real valued function with two real parameters.
 * @author Sean A. Irvine
 */
public abstract class CrFunction2Cr {

  /**
   * Evaluate the function at the given value.
   * @param u first parameter
   * @param v second parameter
   * @return function value
   */
  public abstract CR cr(final CR u, final CR v);

  // Note other combinations of parameters can be added as required

  /**
   * Evaluate the function at an integer value.
   * @param u first parameter
   * @param v second parameter
   * @return function value
   */
  public CR cr(final Q u, final Q v) {
    return cr(CR.valueOf(u), CR.valueOf(v));
  }

  /**
   * Evaluate the function at an integer value.
   * @param u first parameter
   * @param v second parameter
   * @return function value
   */
  public CR cr(final Z u, final Z v) {
    return cr(CR.valueOf(u), CR.valueOf(v));
  }

}

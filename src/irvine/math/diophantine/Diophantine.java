package irvine.math.diophantine;

import irvine.math.z.Z;

import java.util.Iterator;
import java.util.List;

/**
 * Interface implemented by all Diophantine solvers.
 *
 * @author Sean A. Irvine
 */
public interface Diophantine extends Iterable<List<Z>> {

  /**
   * Return an iterator for the solutions of this Diophantine equation.
   * If there are no possible solutions, then the iterator will return
   * <code>false</code> on the first call to <code>hasNext()</code>.
   * Otherwise, the iterator will continue step until all solutions
   * are exhausted (which can be infinite).
   *
   * @return solutions
   */
  @Override
  Iterator<List<Z>> iterator();

  /**
   * Coefficients list.
   *
   * @return list of coefficients.
   */
  List<Z> coefficients();

  /**
   * Powers list.
   *
   * @return list of powers
   */
  List<Z> powers();

  /**
   * String representation of the underlying Diophantine equation.
   *
   * @return equation
   */
  String toString();
}

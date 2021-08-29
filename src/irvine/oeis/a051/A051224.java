package irvine.oeis.a051;

import irvine.oeis.a002.A002562;

/**
 * A051224 Number of ways of placing n nonattacking superqueens on n X n board (symmetric solutions count only once).
 * @author Sean A. Irvine
 */
public class A051224 extends A002562 {

  @Override
  protected boolean isConsistent(final int[] q, final int n) {
    // Check queen-style moves
    if (!super.isConsistent(q, n)) {
      return false;
    }
    // Check knight-style moves
    return A051223.isKnightConsistent(q, n);
  }
}

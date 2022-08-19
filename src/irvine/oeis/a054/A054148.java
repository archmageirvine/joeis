package irvine.oeis.a054;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A054148 T(2n+1,n), array T as in A054144.
 * @author Georg Fischer
 */
public class A054148 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A054148() {
    super(0, "[0, 4,-16, 20,-8, 1]", "[1, 5, 28, 132, 574]", 0);
  }
}

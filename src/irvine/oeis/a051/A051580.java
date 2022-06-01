package irvine.oeis.a051;
// manually

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A051580 a(n) = (2*n+6)!!/6!!, related to A000165 (even double factorials).
 * @author Georg Fischer
 */
public class A051580 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A051580() {
    super(0, "[[0],[8, 2],[-1,-1]]", "[1, 8, 80]", 1);
    setGfType(1);
  }
}

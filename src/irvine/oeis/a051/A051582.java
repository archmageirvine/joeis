package irvine.oeis.a051;
// manually

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A051582 a(n) = (2*n+8)!!/8!!, related to A000165 (even double factorials).
 * @author Georg Fischer
 */
public class A051582 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A051582() {
    super(0, "[[0],[10, 2],[-1,-1]]", "[1, 10, 120]", 1);
    setGfType(1);
  }
}

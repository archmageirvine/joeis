package irvine.oeis.a051;
// manually

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A051578 a(n) = (2*n+4)!!/4!!, related to A000165 (even double factorials).
 * @author Georg Fischer
 */
public class A051578 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A051578() {
    super(0, "[[0],[6, 2],[-1,-1]]", "[1, 6, 48]", 1);
    setGfType(1);
  }
}

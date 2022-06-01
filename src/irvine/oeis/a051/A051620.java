package irvine.oeis.a051;
// manually

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A051620 a(n) = (4*n+8)(!^4)/8(!^4), related to A034177(n+1) ((4*n+4)(!^4) quartic, or 4-factorials).
 * @author Georg Fischer
 */
public class A051620 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A051620() {
    super(0, "[[0],[12, 4],[-1,-1]]", "[1, 12, 192]", 1);
    setGfType(1);
  }
}

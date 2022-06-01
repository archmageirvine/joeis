package irvine.oeis.a051;
// manually

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A051691 a(n) = (5*n+10)(!^5)/10(!^5), related to A052562 ((5*n)(!^5) quintic, or 5-factorials).
 * @author Georg Fischer
 */
public class A051691 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A051691() {
    super(0, "[[0],[15, 5],[-1,-1]]", "[1, 15, 300]", 1);
    setGfType(1);
  }
}

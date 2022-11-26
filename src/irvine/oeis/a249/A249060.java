package irvine.oeis.a249;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A249060 Column 1 of the triangular array at A249057.
 * Recurrence: a(n)-(3+n)*a(n-2) = 0.
 * @author Georg Fischer
 */
public class A249060 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A249060() {
    super(0, "[[0],[3,1],[0],[-1]]", "[1,4]", 0);
  }
}

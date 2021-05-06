package irvine.oeis.a064;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A064352 a(n) = (3*n)!/(2*n)!.
 * @author Georg Fischer
 */
public class A064352 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A064352() {
    super(0, "[[0],[6,-27, 27],[2,-4]]", "[1]", 0);
  }
}

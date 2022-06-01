package irvine.oeis.a064;
// manually 

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A064350 a(n) = (3*n)!/n!.
 * a(n) = (27 * (n - 1)^2 + 27 * (n - 1) + 6) * a(n - 1) with a(0) = 1.
 * @author Georg Fischer
 */
public class A064350 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A064350() {
    super(0, "[[0],[6,-27, 27],[-1]]", "[1]", 0);
  }
}

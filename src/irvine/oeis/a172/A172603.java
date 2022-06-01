package irvine.oeis.a172;
// manually

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A172603 a(n) = (7n)!/(7!^n).
 * @author Georg Fischer
 */
public class A172603 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A172603() {
    super(0, "[[0],[0, 720,-12348, 79576,-252105, 420175,-352947, 117649],[-720]]", "[1]", 0);
    //             expand((7*n-6)*(7*n-5)*(7*n-4)*(7*n-3)*(7*n-2)*(7*n-1)*n);
  }
}

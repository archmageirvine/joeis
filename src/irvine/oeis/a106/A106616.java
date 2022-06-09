package irvine.oeis.a106;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A106616 Numerator of n/(n+15).
 * Recurrence: a(n)=2*a(n-15)-a(n-30)
 * @author Georg Fischer
 */
public class A106616 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A106616() {
    super(0, "[[0],[-1],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[2],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[0],[-1]]",
      "0, 1, 2, 1, 4, 1, 2, 7, 8, 3, 2, 11, 4, 13, 14, 1, 16, 17, 6, 19, 4, 7, 22, 23, 8, 5, 26, 9, 28, 29", 0);
  }
}

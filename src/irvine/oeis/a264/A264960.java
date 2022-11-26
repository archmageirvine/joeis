package irvine.oeis.a264;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A264960 Half-convolution of the central binomial coefficients A000984 with itself.
 * Recurrence: - (2*n-3)*n^2*a(n) + 4*(2*n-1)*(n-1)^2*a(n-1) + 16*(2*n-3)*(n-1)^2*a(n-2) - 64*(2*n-1)*(n-2)^2*a(n-3) = 0
 * @author Georg Fischer
 */
public class A264960 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A264960() {
    super(0, "[[0],[256,-768,576,-128],[-48,128,-112,32],[-4,16,-20,8],[0,0,3,-2]]", "[1,2]", 0);
  }
}

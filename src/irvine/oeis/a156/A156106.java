package irvine.oeis.a156;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A156106 Expansion of F(1/3, 2/3;1/2;27*x/2)/F(1/3,-1/3;-1/2;27*x/2).
 * Recurrence: 2*(2*n-1)*(n-2)*a(n) + (-72*(n-3)^2-171*n+420)*a(n-1) + (297*(n-3)^2+675*n-1674)*a(n-2) - 81*(3*n-5)*(3*n-7)*a(n-3) = 0
 * @author Georg Fischer
 */
public class A156106 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A156106() {
    super(0, "[[0],[2835,-2916, 729],[-999, 1107,-297],[228,-261, 72],[-4, 10,-4]]", "1, 3, 15", 0);
  }
}

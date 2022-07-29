package irvine.oeis.a352;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A352681 a(n) = [x^n] (3*x + 1)*(1 - sqrt(1 - 4*x))/(2*x).
 * a(n) = a(n-1)*((14*n + 2)*(2*n - 3))/((7*n - 6)*(n + 1)).
 * @author Georg Fischer
 */
public class A352681 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A352681() {
    super(0, "[[0],[-6,-38, 28],[6,-1,-7]", "1, 4", 0);
  }
}

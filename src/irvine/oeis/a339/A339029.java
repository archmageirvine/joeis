package irvine.oeis.a339;
// manually hologfm/hologf at 2022-12-01 17:28

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A339029 Expansion of (1 + 4*x - 20*x^2 + 8*x^3 + 33*x^4 - 4*x^5 - 33*x^6)/(1 - 2*x)^4.
 * @author Georg Fischer
 */
public class A339029 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A339029() {
    // o.g.f. (-33*x^6-4*x^5+33*x^4+8*x^3-20*x^2+4*x+1)/(-2*x+1)^4
    // recurrence -(n+2)*(9*(n-1)^2+57*n+139)*u(n)+2*(n+3)*(9*(n-1)^2+75*n+187)*u(n-1) = 0
    super(0, "[[0],[1176, 734, 168, 18],[-296,-226,-57,-9]]", "1, 12, 52, 168", 0);
  }
}

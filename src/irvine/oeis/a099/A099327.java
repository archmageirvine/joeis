package irvine.oeis.a099;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A099327 Expansion of ((1-x)sqrt(1+2x)+(1+x)sqrt(1-2x))/(2(1-2x)^(5/2)).
 * Recurrence: n*(n-3)*a(n) + 2*(-n^2+6)*a(n-1) + 4*(n-1)*(n-5)*a(n-2) + 8*(n-1)*(n-2)*a(n-3) = 0.
 * @author Georg Fischer
 */
public class A099327 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A099327() {
    super(0, "[[0],[-16, 24,-8],[20,-24, 4],[-12, 0, 2],[0, 3,-1]]", "1, 5, 16, 45", 0);
  }
}

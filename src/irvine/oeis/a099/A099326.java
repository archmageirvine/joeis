package irvine.oeis.a099;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A099326 Expansion of ((1-2x)sqrt(1+2x)+sqrt(1-2x))/(2(1-2x)^(5/2)).
 * Recurrence: n*(n-2)*a(n) +2*(-n^2+3)*a(n-1) -4*(n-1)*(n-4)*a(n-2) +8*(n-1)*(n-2)*a(n-3)=0.
 * @author Georg Fischer
 */
public class A099326 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A099326() {
    super(0, "[[0],[-16, 24,-8],[16,-20, 4],[-6, 0, 2],[0, 2,-1]]", "1, 4, 11", 0);
  }
}

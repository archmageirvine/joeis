package irvine.oeis.a355;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A355268 a(n) = n! * [x^n] -exp(x^2)/(x - 1).
 * Recurrence: a(n) -n*a(n-1) +2*(-n+1)*a(n-2) +2*(n-1)*(n-2)*a(n-3)=0.
 * @author Georg Fischer
 */
public class A355268 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A355268() {
    super(0, "[[0],[4,-6, 2],[2,-2],[0,-1],[1]", "1", 0);
  }
}

package irvine.oeis.a344;
// manually 2022-08-22

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A344935 a(0)=1; for n &gt; 0, a(n) = n*(a(n-1) + i^(n-1)) if n is odd, n*a(n-1) + i^n otherwise, where i = sqrt(-1).
 * Recurrence: a(n) -n*a(n-1) +2*a(n-2) +2*(-n+2)*a(n-3) +a(n-4) +(-n+4)*a(n-5)=0.
 * @author Georg Fischer
 */
public class A344935 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A344935() {
    super(0, "[[0],[4,-1],[1],[4,-2],[2],[0,-1],[1]]", "1, 2, 3, 6", 0);
  }
}

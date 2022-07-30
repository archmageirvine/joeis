package irvine.oeis.a098;
// manually dfinite/holos at 2022-07-30 11:44

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A098051 Number of peakless Motzkin paths with no U H...HU's where U=(1,1) and H=(1,0) (can be easily expressed using RNA secondary structure terminology).
 * Recurrence (n+2)*a(n) +5*(-n-1)*a(n-1) +2*(4*n+1)*a(n-2) -4*n*a(n-3) +2*(-2*n+11)*a(n-5) +2*(4*n-23)*a(n-6) +4*(-n+6)*a(n-7)=0.
 * @author Georg Fischer
 */
public class A098051 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A098051() {
    super(0, "[[0],[24,-4],[-46, 8],[22,-4],[0],[0,-4],[2, 8],[-5,-5],[2, 1]]", "1, 1, 1, 2, 4, 8, 16, 32", 0);
  }
}

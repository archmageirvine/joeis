package irvine.oeis.a359;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A359311 Number of Catalan paths (nonnegative, starting and ending at 0, step +/-1) of 2*n steps which reach at least 6 at some point.
 * Recurrence -(n+1)*(n-6)*a(n) +3*(3*n^2-17*n+4)*a(n-1) +2*(-13*n^2+80*n-87)*a(n-2) +(25*n^2-161*n+246)*a(n-3) -2*(n-3)*(2*n-7)*a(n-4)=0.
 * @author Georg Fischer
 */
public class A359311 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A359311() {
    super(0, "[[0],[-42,26,-4],[246,-161,25],[-174,160,-26],[12,-51,9],[6,5,-1]]", "0,0,0,0,0,0,1", 0);
  }
}

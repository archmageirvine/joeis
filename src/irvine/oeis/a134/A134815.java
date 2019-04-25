package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134815 Leader-Follower four person 4 X 4 matrix zero sum game Markov in <code>a 16 by 16</code> matrix: Follower matrix: MA={{0, <code>1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}, {1, 0, 0, 1}}</code>: game value <code>=1/3</code> Leader Matrix: MB={{0, <code>1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}, {1, 0, 0, 5}}</code>: game value=-1 Characteristic polynomial: <code>1 + 8 x^3 - 4 x^4 + 18 x^6 - 24 x^7 + 6 x^8 + 16 x^9 - 36 x^10 + 24 x^11 + x^12 - 16 x^13 + 18 x^14 - 8 x^15 + x^16)</code>.
 * @author Sean A. Irvine
 */
public class A134815 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134815() {
    super(new long[] {-1, 0, 0, -6, 2, 0, -5, 6}, new long[] {4, 9, 35, 162, 790, 3923, 19602, 98108});
  }
}

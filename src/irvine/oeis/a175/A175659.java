package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175659 Eight bishops and one elephant on a 3 X 3 chessboard: a(n)= (3^(n+1)-Jacobsthal(n+1))-(3^n-Jacobsthal(n)), with Jacobsthal=A001045.
 * @author Sean A. Irvine
 */
public class A175659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175659() {
    super(new long[] {-6, -1, 4}, new long[] {1, 6, 16});
  }
}

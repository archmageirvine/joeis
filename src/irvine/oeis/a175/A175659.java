package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175659 Eight bishops and one elephant on a <code>3 X 3</code> chessboard: <code>a(n)= (3^(n+1)-Jacobsthal(n+1))-(3^n-Jacobsthal(n))</code>, with <code>Jacobsthal=A001045</code>.
 * @author Sean A. Irvine
 */
public class A175659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175659() {
    super(new long[] {-6, -1, 4}, new long[] {1, 6, 16});
  }
}

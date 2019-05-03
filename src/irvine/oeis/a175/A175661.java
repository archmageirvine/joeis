package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175661 Eight bishops and one elephant on a <code>3 X 3</code> chessboard: <code>a(n) = 2^(n+2)-3*F(n+1)</code>, with <code>F(n) = A000045(n)</code>.
 * @author Sean A. Irvine
 */
public class A175661 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175661() {
    super(new long[] {-2, -1, 3}, new long[] {1, 5, 10});
  }
}

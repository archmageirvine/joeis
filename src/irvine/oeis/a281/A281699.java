package irvine.oeis.a281;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A281699 Sierpinski stellated octahedron numbers: a(n) = 2*(-3*2^(n+1) + 2^(2n+3) + 5).
 * @author Sean A. Irvine
 */
public class A281699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281699() {
    super(new long[] {8, -14, 7}, new long[] {14, 50, 218});
  }
}

package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134035 The 4 X 4 Fibonacci/ anti-Fibonacci game switched modulo 2 with its dual: MA1={{0,1},{1,1}};MB1={{0,1}{1,3}}; MA2={{0,1},1,3}};MB2={{1,0},{1,1}}; the game has two characteristic polynomials: (-3 + 5 x - 3 x^3 + x^4, -1 + x + 2 x^2 - 3 x^3 + x^4}.
 * @author Sean A. Irvine
 */
public class A134035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134035() {
    super(1, new long[] {-3, 3, 8, -8, -6, 6, 1}, new long[] {2, 4, 8, 13, 21, 39, 64});
  }
}

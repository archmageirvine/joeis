package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134035 The <code>4 X 4 Fibonacci/ anti-Fibonacci</code> game switched modulo 2 with its dual: <code>MA1={{0,1},{1,1}};MB1={{0,1}{1,3}}; MA2={{0,1},1,3}};MB2={{1,0},{1,1}}</code>; the game has two characteristic polynomials: <code>(-3 + 5 x - 3 x^3 + x^4, -1 + x + 2 x^2 - 3 x^3 + x^4}</code>.
 * @author Sean A. Irvine
 */
public class A134035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134035() {
    super(new long[] {-3, 3, 8, -8, -6, 6, 1}, new long[] {2, 4, 8, 13, 21, 39, 64});
  }
}

package irvine.oeis.a205;
// manually deris2/essent at 2021-11-04

import irvine.oeis.a109.A109049;

/**
 * A205382 s(k)-s(j), where (s(k),s(j)) is the least such pair for which n divides their difference, and s(j)=(2j-1)^2.
 * @author Georg Fischer
 */
public class A205382 extends A109049 {

  {
    setOffset(1);
  }

  /** Construct the sequence. */
  public A205382() {
    skip(1);
  }
}

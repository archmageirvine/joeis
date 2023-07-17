package irvine.oeis.a137;
// manually A105471/parmof2 at 2023-07-17 09:13

import irvine.oeis.a105.A105471;

/**
 * A137290 Fibonacci(n) mod 30.
 * @author Georg Fischer
 */
public class A137290 extends A105471 {

  /** Construct the sequence. */
  public A137290() {
    super(1, 30);
    super.next();
  }
}

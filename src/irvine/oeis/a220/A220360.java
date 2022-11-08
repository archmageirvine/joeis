package irvine.oeis.a220;
// manually lingf at 2022-11-07 09:27

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A220360 a(n) = Fibonacci(n-1) * Fibonacci(n+1) * Fibonacci(n+2).
 * @author Georg Fischer
 */
public class A220360 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A220360() {
    super(1, "[0,0,6,-3,-1]", "[1,-3,-6,3,1]");
  }
}

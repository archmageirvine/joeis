package irvine.oeis.a155;
// manually lingf at 2022-11-07 09:27

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A155138 a(n) = nonnegative value y such that (A155136(n), y) is a solution to the Diophantine equation x^3+28*x^2 = y^2.
 * @author Georg Fischer
 */
public class A155138 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A155138() {
    super(1, "[0,0,27,-60,27,0,0,96,-90,-24,30]", "[1,-4,6,-4,1]");
  }
}

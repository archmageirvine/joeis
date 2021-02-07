package irvine.oeis.a080;
// manually

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A080151 Let m = Wonderful Demlo number A002477(n); a(n) = sum of digits of m.
 * @author Georg Fischer
 */
public class A080151 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A080151() {
    super(1, "[0, 1, 3, 5, 7, 9, 11, 13, 15, 17]", "[1,-1, 0, 0, 0, 0, 0, 0, 0,-1, 1]");
  }
}

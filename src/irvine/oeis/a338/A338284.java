package irvine.oeis.a338;
// manually lingf at 2022-11-07 09:27

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A338284 a(n) is the smallest nonsquare m such that the second partial quotient in the continued fraction for sqrt(m) equals n.
 * @author Georg Fischer
 */
public class A338284 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A338284() {
    super(1, "[0,7,2,2,-1,-1,1]", "[1,0,-3,0,3,0,-1]");
  }
}

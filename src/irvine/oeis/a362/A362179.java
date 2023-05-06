package irvine.oeis.a362;
// manually ogf/lingf at 2023-05-01 14:27

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A362179 Main diagonal of the square array A058395.
 * @author Georg Fischer
 */
public class A362179 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A362179() {
    super(0, "[1,-5,10,-10,5,-1]", "[1,-6,12,-8]");
  }
}

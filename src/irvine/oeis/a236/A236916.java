package irvine.oeis.a236;
// manually

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A236916 The first "octad" is 0, 1, 2, 2, 2, 2, 3, 3; thereafter add 4 to get the next octad.
 * @author Georg Fischer
 */
public class A236916 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A236916() {
    super(0, "[0, 1, 1, 0, 0, 0, 1, 0, 1]", "[1,-1, 0, 0, 0, 0, 0, 0,-1, 1]");
  }
}

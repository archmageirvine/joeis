package irvine.oeis.a393;

import irvine.oeis.ca.TuringMachineSequence;

/**
 * A393686 Number computed by Wolfram's 2-state 3-symbol Turing machine 596440 when started with n on the tape.
 * @author Sean A. Irvine
 */
public class A393686 extends TuringMachineSequence {

  /** Construct the sequence. */
  public A393686() {
    super(1, 596440, 2, 3);
  }
}


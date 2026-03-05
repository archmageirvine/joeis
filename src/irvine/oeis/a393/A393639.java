package irvine.oeis.a393;

import irvine.oeis.ca.TuringMachineSequence;

/**
 * A393639 Number computed by Wolfram's 1-state 3-symbol Turing machine 29 when started with n on the tape.
 * @author Sean A. Irvine
 */
public class A393639 extends TuringMachineSequence {

  /** Construct the sequence. */
  public A393639() {
    super(1, 29, 1, 3);
  }
}


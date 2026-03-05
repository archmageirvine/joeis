package irvine.oeis.a393;

import irvine.oeis.ca.TuringMachineRuntimeSequence;

/**
 * A393640 Halting time for Wolfram's 1-state 3-symbol Turing machine 29 when started with n on the tape.
 * @author Sean A. Irvine
 */
public class A393640 extends TuringMachineRuntimeSequence {

  /** Construct the sequence. */
  public A393640() {
    super(1, 29, 1, 3);
  }
}


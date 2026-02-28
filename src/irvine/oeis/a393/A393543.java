package irvine.oeis.a393;

import irvine.oeis.ca.TuringMachineRuntimeSequence;

/**
 * A393543 Halting time for Wolfram's 3-state 2-symbol Turing machine 599063 when started with n on the tape.
 * @author Sean A. Irvine
 */
public class A393543 extends TuringMachineRuntimeSequence {

  /** Construct the sequence. */
  public A393543() {
    super(1, 599063, 3, 2);
  }
}


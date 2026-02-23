package irvine.oeis.a393;

import irvine.oeis.ca.TuringMachineRuntimeSequence;

/**
 * A393507 Halting time for Wolfram's 3-state 2-symbol Turing machine 600720 when started with n on the tape.
 * @author Sean A. Irvine
 */
public class A393507 extends TuringMachineRuntimeSequence {

  /** Construct the sequence. */
  public A393507() {
    super(1, 600720, 3, 2);
  }
}


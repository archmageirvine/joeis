package irvine.oeis.a393;

import irvine.oeis.ca.TuringMachineRuntimeSequence;

/**
 * A393505 Halting time for Wolfram's 3-state 2-symbol Turing machine 1955095 when started with n on the tape or -1 if the computation does not terminate.
 * @author Sean A. Irvine
 */
public class A393505 extends TuringMachineRuntimeSequence {

  /** Construct the sequence. */
  public A393505() {
    super(1, 1955095, 3, 2, 100000000);
  }
}


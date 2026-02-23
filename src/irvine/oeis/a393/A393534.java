package irvine.oeis.a393;

import irvine.oeis.ca.TuringMachineRuntimeSequence;

/**
 * A393534 Halting time for Wolfram's 3-state 2-symbol Turing machine 589111 when started with n on the tape.
 * @author Sean A. Irvine
 */
public class A393534 extends TuringMachineRuntimeSequence {

  /** Construct the sequence. */
  public A393534() {
    super(1, 589111, 3, 2);
  }
}


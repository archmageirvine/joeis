package irvine.oeis.a393;

import irvine.oeis.ca.TuringMachineRuntimeSequence;

/**
 * A393684 Halting time for Wolfram's 2-state 3-symbol Turing machine 840971 when started with n on the tape.
 * @author Sean A. Irvine
 */
public class A393684 extends TuringMachineRuntimeSequence {

  /** Construct the sequence. */
  public A393684() {
    super(1, 840971, 2, 3);
  }
}


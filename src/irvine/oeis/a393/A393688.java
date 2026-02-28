package irvine.oeis.a393;

import irvine.oeis.ca.TuringMachineSequence;

/**
 * A393688 Number computed by Wolfram's 2-state 3-symbol Turing machine 840971 when started with n on the tape.
 * @author Sean A. Irvine
 */
public class A393688 extends TuringMachineSequence {

  /** Construct the sequence. */
  public A393688() {
    super(1, 840971, 2, 3);
  }
}


package irvine.oeis.a393;

import irvine.oeis.ca.TuringMachineSequence;

/**
 * A393542 Number computed by Wolfram's 3-state 2-symbol Turing machine 599063 when started with n on the tape.
 * @author Sean A. Irvine
 */
public class A393542 extends TuringMachineSequence {

  /** Construct the sequence. */
  public A393542() {
    super(1, 599063, 3, 2);
  }
}


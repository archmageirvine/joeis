package irvine.oeis.a393;

import irvine.oeis.ca.TuringMachineSequence;

/**
 * A393533 Number computed by Wolfram's 3-state 2-symbol Turing machine 589111 when started with n on the tape.
 * @author Sean A. Irvine
 */
public class A393533 extends TuringMachineSequence {

  /** Construct the sequence. */
  public A393533() {
    super(1, 589111, 3, 2);
  }
}


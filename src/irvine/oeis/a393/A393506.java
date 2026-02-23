package irvine.oeis.a393;

import irvine.oeis.ca.TuringMachineSequence;

/**
 * A393506 Number computed by Wolfram's 3-state 2-symbol Turing machine 600720 when started with n on the tape.
 * @author Sean A. Irvine
 */
public class A393506 extends TuringMachineSequence {

  /** Construct the sequence. */
  public A393506() {
    super(1, 600720, 3, 2);
  }
}


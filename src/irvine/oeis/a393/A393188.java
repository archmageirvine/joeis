package irvine.oeis.a393;

import irvine.oeis.ca.TuringMachineSequence;

/**
 * A393188 a(n) = u(n) OR (u(n) - 1) where u(n) = n + (n AND -n) assuming a two's complement representation for negative values.
 * @author Sean A. Irvine
 */
public class A393188 extends TuringMachineSequence {

  /** Construct the sequence. */
  public A393188() {
    super(1, 2079);
  }
}


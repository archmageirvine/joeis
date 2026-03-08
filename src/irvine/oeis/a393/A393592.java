package irvine.oeis.a393;

import irvine.oeis.InverseSequence;

/**
 * A393592 allocated for Robert G. Wilson v.
 * @author Sean A. Irvine
 */
public class A393592 extends InverseSequence {

  /** Construct the sequence. */
  public A393592() {
    super(2, 2, new A393591());
  }
}


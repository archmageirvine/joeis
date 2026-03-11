package irvine.oeis.a393;

import irvine.oeis.InverseSequence;

/**
 * A393592 Position of the first occurrence of n in A393591.
 * @author Sean A. Irvine
 */
public class A393592 extends InverseSequence {

  /** Construct the sequence. */
  public A393592() {
    super(2, 2, new A393591());
  }
}


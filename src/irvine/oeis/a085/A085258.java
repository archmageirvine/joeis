package irvine.oeis.a085;

import irvine.oeis.InverseSequence;

/**
 * A085258 Smallest number with exactly n representations as sum of a powerful and a squarefree number.
 * @author Sean A. Irvine
 */
public class A085258 extends InverseSequence {

  /** Construct the sequence. */
  public A085258() {
    super(1, 0, new A085257());
  }
}

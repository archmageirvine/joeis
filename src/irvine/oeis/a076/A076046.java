package irvine.oeis.a076;

import irvine.oeis.FiniteSequence;

/**
 * A076046 Ramanujan-Nagell numbers: the triangular numbers (of the form a*(a+1)/2) which are also of the form 2^b - 1.
 * @author Georg Fischer
 */
public class A076046 extends FiniteSequence {

  /** Construct the sequence. */
  public A076046() {
    super(0, 1, 3, 15, 4095);
  }
}

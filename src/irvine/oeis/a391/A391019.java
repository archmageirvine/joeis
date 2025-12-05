package irvine.oeis.a391;

import irvine.oeis.FiniteSequence;

/**
 * A391019 The unique set of nine distinct squarefree numbers whose reciprocals add to 1/2, with the property that each number has exactly two distinct prime factors.
 * @author Sean A. Irvine
 */
public class A391019 extends FiniteSequence {

  /** Construct the sequence. */
  public A391019() {
    super(1, FINITE, 6, 10, 15, 21, 26, 35, 39, 65, 91);
  }
}

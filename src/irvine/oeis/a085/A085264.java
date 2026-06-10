package irvine.oeis.a085;

import irvine.oeis.InverseSequence;

/**
 * A085264 Smallest number with exactly n representations as sum of a squarefree number (A005117) and a square (A000290).
 * @author Sean A. Irvine
 */
public class A085264 extends InverseSequence {

  /** Construct the sequence. */
  public A085264() {
    super(1, 0, new A085263());
  }
}

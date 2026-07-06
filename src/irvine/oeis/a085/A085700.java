package irvine.oeis.a085;

import irvine.oeis.FiniteSequence;

/**
 * A085700 Numbers k such that (2k)! - (2k-2)! + (2k-4)! - ... + (-1)^k 0! is prime.
 * @author Sean A. Irvine
 */
public class A085700 extends FiniteSequence {

  /** Construct the sequence. */
  public A085700() {
    super(1, FINITE, 2, 4, 26, 112, 365, 449, 453);
  }
}

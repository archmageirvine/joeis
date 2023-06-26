package irvine.oeis.a001;

import irvine.oeis.FiniteSequence;

/**
 * A001272 Numbers k such that k! - (k-1)! + (k-2)! - (k-3)! + ... - (-1)^k*1! is prime.
 * @author Sean A. Irvine
 */
public class A001272 extends FiniteSequence {

  /** Construct the sequence. */
  public A001272() {
    super(1, FINITE, 3, 4, 5, 6, 7, 8, 10, 15, 19, 41, 59, 61, 105, 160, 661, 2653, 3069, 3943, 4053, 4998, 8275, 9158, 11164, 43592, 59961);
  }
}


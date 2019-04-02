package irvine.oeis.a001;

import irvine.oeis.FiniteSequence;

/**
 * A001272 Numbers n such that n! - (n-1)! + (n-2)! - (n-3)! + ... - (-1)^n*1! is prime.
 * @author Sean A. Irvine
 */
public class A001272 extends FiniteSequence {

  /** Construct the sequence. */
  public A001272() {
    super(3, 4, 5, 6, 7, 8, 10, 15, 19, 41, 59, 61, 105, 160, 661, 2653, 3069, 3943, 4053, 4998, 8275, 9158, 11164, 43592, 59961);
  }
}


package irvine.oeis.a034;

import irvine.oeis.FiniteSequence;

/**
 * A034012 Positive integers k satisfying y^2 = x^5 - k where x^5 and y^2 are not both divisible by 2^10 and k = 2^(2*m)*d with d a positive squarefree integer d = 7 (mod 8) such that the class number of Q(sqrt(-d)) is not divisible by 5.
 * @author Sean A. Irvine
 */
public class A034012 extends FiniteSequence {

  /** Construct the sequence. */
  public A034012() {
    super(1, FINITE, 1, 16, 19, 32, 32, 341, 608, 768, 2816);
  }
}


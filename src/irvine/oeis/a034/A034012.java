package irvine.oeis.a034;

import irvine.oeis.FiniteSequence;

/**
 * A034012 Positive integers k satisfying <code>y^2 = x^5 -</code> k where <code>x^5</code> and <code>y^2</code> are not both divisible by <code>2^10</code> and k <code>= 2^(2*m)*d</code> with d a positive square-free integer d <code>= 7 (mod 8)</code> such that the class number of <code>Q(sqrt(-d))</code> is not divisible by 5.
 * @author Sean A. Irvine
 */
public class A034012 extends FiniteSequence {

  /** Construct the sequence. */
  public A034012() {
    super(1, 16, 19, 32, 32, 341, 608, 768, 2816);
  }
}


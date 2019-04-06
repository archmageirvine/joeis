package irvine.oeis.a290;

import irvine.oeis.FiniteSequence;

/**
 * A290014 Values of n for which Sum_{k=1..n} k!^10 is prime.
 * @author Georg Fischer
 */
public class A290014 extends FiniteSequence {

  /** Construct the sequence. */
  public A290014() {
    super(3, 4, 5, 16, 25);
  }
}

package irvine.oeis.a306;

import irvine.oeis.FiniteSequence;

/**
 * A306955 Let f map k to the sum of the factorials of the digits of k (A061602); sequence lists numbers such that f(f(f(k)))=k.
 * @author Georg Fischer
 */
public class A306955 extends FiniteSequence {

  /** Construct the sequence. */
  public A306955() {
    super(1, FINITE, 1, 2, 145, 169, 1454, 40585, 363601);
  }
}

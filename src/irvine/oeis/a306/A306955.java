package irvine.oeis.a306;

import irvine.oeis.FiniteSequence;

/**
 * A306955 Let f map k to the sum of the factorials of the digits of k <code>(A061602)</code>; sequence lists numbers such that <code>f(f(f(k)))=k</code>.
 * @author Georg Fischer
 */
public class A306955 extends FiniteSequence {

  /** Construct the sequence. */
  public A306955() {
    super(1, 2, 145, 169, 1454, 40585, 363601);
  }
}

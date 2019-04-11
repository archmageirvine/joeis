package irvine.oeis.a236;

import irvine.oeis.FiniteSequence;

/**
 * A236686 Possible values for positive integers a,b,c,d such that <code>1/a +</code> 1/b + 1/c + 1/d <code>= 1</code>.
 * @author Georg Fischer
 */
public class A236686 extends FiniteSequence {

  /** Construct the sequence. */
  public A236686() {
    super(2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 18, 20, 24, 42);
  }
}

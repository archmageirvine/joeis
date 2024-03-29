package irvine.oeis.a106;
// Generated by gen_seq4.pl morfps19/morfps at 2024-03-20 21:20

import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A106654 Four-symbol substitution, characteristic polynomial: x^4-x^2-x-1.
 * @author Georg Fischer
 */
public class A106654 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A106654() {
    super(0, "1", "4", "1->2, 2->3, 3->4, 4->123");
  }
}

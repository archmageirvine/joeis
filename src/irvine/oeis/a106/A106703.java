package irvine.oeis.a106;

import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A106703 4-symbol substitution from L[n] Coxeter diagram with n=3.
 * @author Sean A. Irvine
 */
public class A106703 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A106703() {
    super(0, "1", "1", "1->333, 2->34, 3->12, 4->222");
  }
}

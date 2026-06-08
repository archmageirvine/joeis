package irvine.oeis.a106;

import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A106704 6-symbol substitution from S[n] Coxeter diagram with n=4.
 * @author Sean A. Irvine
 */
public class A106704 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A106704() {
    super(0, "1", "5", "1->56, 2->5555, 3->45, 4->3333, 5->123, 6->1111");
  }
}


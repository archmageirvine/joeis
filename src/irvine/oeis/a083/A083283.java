package irvine.oeis.a083;

import irvine.math.cr.CR;
import irvine.oeis.EngelExpansionSequence;

/**
 * A083283 Engel expansion for i^i = exp(-Pi/2).
 * @author Sean A. Irvine
 */
public class A083283 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A083283() {
    super(1, CR.HALF_PI.negate().exp());
  }
}

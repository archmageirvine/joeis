package irvine.oeis.a016;

import irvine.oeis.FiniteSequence;

/**
 * A016107 Bachet's equation: X^2 <code>+ k =</code> Y^3, <code>k=999</code>.
 * @author Sean A. Irvine
 */
public class A016107 extends FiniteSequence {

  /** Construct the sequence. */
  public A016107() {
    super(1, 27, 251, 1782, 2295, 3370501);
  }
}

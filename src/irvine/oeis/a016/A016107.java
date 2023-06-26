package irvine.oeis.a016;

import irvine.oeis.FiniteSequence;

/**
 * A016107 Bachet's equation: X^2 + k = Y^3, k=999. The terms are values of X, corresponding Y are in A248481.
 * @author Sean A. Irvine
 */
public class A016107 extends FiniteSequence {

  /** Construct the sequence. */
  public A016107() {
    super(1, FINITE, 1, 27, 251, 1782, 2295, 3370501);
  }
}

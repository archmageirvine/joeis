package irvine.oeis.a053;

import irvine.oeis.FiniteSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a005.A005408;

/**
 * A053460 The 120 points of the 600-cell exactly integrate homogeneous polynomials of degree n.
 * @author Sean A. Irvine
 */
public class A053460 extends UnionSequence {

  /** Construct the sequence. */
  public A053460() {
    super(new A005408(), new FiniteSequence(2, 4, 6, 8, 10, 14, 16, 18, 22, 26, 28, 34, 38, 46, 58));
  }
}

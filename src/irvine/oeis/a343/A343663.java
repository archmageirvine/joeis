package irvine.oeis.a343;
// manually 2025-04-09/poly at 2025-04-09 21:14

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.PrependSequence;

/**
 * A343663 Number of unlabeled binary rooted semi-identity plane trees with 2*n - 1 nodes.
 * G.f.: x*A(x) where A(x) satisfies A(x) = 1 + x + x*(A(x)^2 - A(x^2)).- _Andrew Howroyd_, May 07 2021
 * @author Georg Fischer
 */
public class A343663 extends PrependSequence {

  /** Construct the sequence. */
  public A343663() {
    super(1, new PolynomialFieldSequence(1, "[[0, 1],[1, 1],[0, 0, 1]]", ",p1,A,^2,p2,sub,-,<1,+"), 1);
  }
}

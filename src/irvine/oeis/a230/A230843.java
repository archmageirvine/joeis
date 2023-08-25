package irvine.oeis.a230;
// manually robots/union2 at 2023-08-23 09:55

import irvine.oeis.UnionSequence;
import irvine.oeis.a001.A001248;
import irvine.oeis.a008.A008578;
import irvine.oeis.a054.A054753;

/**
 * A230843 Cubefree numbers which in their canonical prime factorization have mutually distinct exponents.
 * @author Georg Fischer
 */
public class A230843 extends UnionSequence {

  /** Construct the sequence. */
  public A230843() {
    super(1, new UnionSequence(1, new A008578(), new A001248()), new A054753());
  }
}

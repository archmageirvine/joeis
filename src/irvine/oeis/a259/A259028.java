package irvine.oeis.a259;

import irvine.oeis.FiniteSequence;

/**
 * A259028 <code>a(n) =</code> least number m such that digital root of m is <code>n*(digital</code> root of <code>m-th</code> prime).
 * @author Georg Fischer
 */
public class A259028 extends FiniteSequence {

  /** Construct the sequence. */
  public A259028() {
    super(25, 29, 12, 26, 131, 42, 106, 8, 63);
  }
}

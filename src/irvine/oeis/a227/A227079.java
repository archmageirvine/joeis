package irvine.oeis.a227;

import irvine.oeis.FiniteSequence;

/**
 * A227079 Solutions n to the Diophantine equation: <code>n = (2*x^2 - 1)^2 = (6*y^2 - 5)</code>.
 * @author Georg Fischer
 */
public class A227079 extends FiniteSequence {

  /** Construct the sequence. */
  public A227079() {
    super(1, 49, 289, 5041, 274266721L);
  }
}

package irvine.oeis.a213;
// manually 2023-01-13

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A213627 Expansion of psi(x)^4 / psi(x^3) in powers of x where psi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A213627 extends EulerTransform {

  /** Construct the sequence. */
  public A213627() {
    super(new PeriodicSequence(4, -4, 3, -4, 4, -3), 1);
  }
}

package irvine.oeis.a065;
// manually ietman at 2023-02-08 22:11

import irvine.oeis.PrependSequence;
import irvine.oeis.a077.A077925;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A065492 Exponents in expansion of constant A065480 as a product zeta(n)^(-a(n)).
 * @author Georg Fischer
 */
public class A065492 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A065492() {
    super(0, new PrependSequence(0, new A077925(), 1, 0), 1);
    next();
  }
}

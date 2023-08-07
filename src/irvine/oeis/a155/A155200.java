package irvine.oeis.a155;

import irvine.oeis.PrependSequence;
import irvine.oeis.a159.A159034;
import irvine.oeis.transform.EulerTransform;

/**
 * A155200 G.f.: A(x) = exp( Sum_{n&gt;=1} 2^(n^2) * x^n/n ), a power series in x with integer coefficients.
 * @author Georg Fischer
 */
public class A155200 extends PrependSequence {

  /** Construct the sequence. */
  public A155200() {
    super(0, new EulerTransform(0, new A159034()), 1);
  }
}

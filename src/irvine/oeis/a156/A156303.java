package irvine.oeis.a156;
// manually etman at 2023-02-01 22:30

import irvine.oeis.a001.A001615;
import irvine.oeis.transform.EulerTransform;

/**
 * A156303 G.f.: A(x) = exp( Sum_{n&gt;=1} sigma(n^2)*x^n/n ), a power series in x with integer coefficients.
 * @author Georg Fischer
 */
public class A156303 extends EulerTransform {

  /** Construct the sequence. */
  public A156303() {
    super(0, new A001615(), 1);
  }
}

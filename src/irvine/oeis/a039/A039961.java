package irvine.oeis.a039;

import irvine.oeis.PrependSequence;
import irvine.oeis.a108.A108299;

/**
 * A039961 Triangle of coefficients in a Fibonacci-like sequence of polynomials.
 * @author Sean A. Irvine
 */
public class A039961 extends PrependSequence {

  /** Construct the sequence. */
  public A039961() {
    super(new A108299(), 1);
  }
}


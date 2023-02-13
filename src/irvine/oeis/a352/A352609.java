package irvine.oeis.a352;
// manually ietman at 2023-02-12 21:36

import irvine.oeis.a065.A065091;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A352609 Inverse Euler transform of odd primes.
 * @author Georg Fischer
 */
public class A352609 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A352609() {
    super(1, new A065091(), 0);
    next();
  }
}

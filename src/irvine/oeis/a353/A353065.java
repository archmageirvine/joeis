package irvine.oeis.a353;
// manually etman at 2023-02-01 22:30

import irvine.oeis.a065.A065091;
import irvine.oeis.transform.EulerTransform;

/**
 * A353065 Euler transform of odd primes.
 * @author Georg Fischer
 */
public class A353065 extends EulerTransform {

  /** Construct the sequence. */
  public A353065() {
    super(0, new A065091(), 1);
  }
}

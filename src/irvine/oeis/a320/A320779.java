package irvine.oeis.a320;
// manually ietman at 2023-02-12 21:36

import irvine.oeis.a000.A000005;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A320779 Inverse Euler transform of the number of divisors function A000005.
 * @author Georg Fischer
 */
public class A320779 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A320779() {
    super(1, new A000005());
  }
}

package irvine.oeis.a320;
// manually ietman at 2023-02-12 21:36

import irvine.oeis.a000.A000203;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A320780 Inverse Euler transform of the sum-of-divisors or sigma function A000203.
 * @author Georg Fischer
 */
public class A320780 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A320780() {
    super(1, new A000203());
  }
}

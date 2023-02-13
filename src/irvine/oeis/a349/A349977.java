package irvine.oeis.a349;
// manually ietman at 2023-02-12 21:36

import irvine.oeis.a000.A000073;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A349977 Inverse Euler transform of the classical tribonacci numbers.
 * @author Georg Fischer
 */
public class A349977 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A349977() {
    super(1, new A000073(), 1);
    next();
  }
}

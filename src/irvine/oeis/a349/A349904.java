package irvine.oeis.a349;
// manually ietman at 2023-02-12 21:36

import irvine.oeis.a000.A000073;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A349904 Inverse Euler transform of the tribonacci numbers A000073.
 * @author Georg Fischer
 */
public class A349904 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A349904() {
    super(1, new A000073(), 0);
    next();
  }
}

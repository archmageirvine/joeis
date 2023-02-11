package irvine.oeis.a191;
// manually ietman at 2023-02-08 22:11

import irvine.oeis.a053.A053419;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A191970 Number of connected graphs with n edges with loops allowed.
 * @author Georg Fischer
 */
public class A191970 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A191970() {
    super(0, new A053419(), 1);
  }
}

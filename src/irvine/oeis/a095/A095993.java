package irvine.oeis.a095;
// manually ietman at 2023-02-08 22:11

import irvine.oeis.a000.A000670;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A095993 Inverse Euler transform of the ordered Bell numbers A000670.
 * @author Georg Fischer
 */
public class A095993 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A095993() {
    super(0, new A000670(), 1);
  }
}

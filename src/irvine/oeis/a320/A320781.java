package irvine.oeis.a320;
// manually ietman at 2023-02-12 21:36

import irvine.oeis.a008.A008683;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A320781 Inverse Euler transform of the Moebius function A008683.
 * @author Georg Fischer
 */
public class A320781 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A320781() {
    super(1, new A008683());
  }
}

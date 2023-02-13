package irvine.oeis.a320;
// manually ietman at 2023-02-12 21:36

import irvine.oeis.a008.A008966;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A320782 Inverse Euler transform of the unsigned Moebius function A008966.
 * @author Georg Fischer
 */
public class A320782 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A320782() {
    super(0, new A008966(), 0, 1);
  }
}

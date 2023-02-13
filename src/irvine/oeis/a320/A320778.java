package irvine.oeis.a320;
// manually ietman at 2023-02-12 21:36

import irvine.oeis.a000.A000010;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A320778 Inverse Euler transform of the Euler totient function phi = A000010.
 * @author Georg Fischer
 */
public class A320778 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A320778() {
    super(0, new A000010(), 0, 1);
  }
}

package irvine.oeis.a320;
// manually ietman at 2023-02-12 21:36

import irvine.oeis.a001.A001055;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A320785 Inverse Euler transform of the number of factorizations function A001055.
 * @author Georg Fischer
 */
public class A320785 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A320785() {
    super(0, new A001055(), 0, 1);
  }
}

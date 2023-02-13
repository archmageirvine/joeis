package irvine.oeis.a320;
// manually ietman at 2023-02-12 21:36

import irvine.oeis.a001.A001221;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A320777 Inverse Euler transform of the number of distinct prime factors (without multiplicity) function A001221.
 * @author Georg Fischer
 */
public class A320777 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A320777() {
    super(0, new A001221(), 0, 1);
  }
}

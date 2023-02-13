package irvine.oeis.a320;
// manually ietman at 2023-02-12 21:36

import irvine.oeis.a001.A001222;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A320776 Inverse Euler transform of the number of prime factors (with multiplicity) function A001222.
 * @author Georg Fischer
 */
public class A320776 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A320776() {
    super(0, new A001222(), 0, 1);
  }
}

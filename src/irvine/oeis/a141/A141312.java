package irvine.oeis.a141;
// manually ietman at 2023-02-08 22:11

import irvine.oeis.a003.A003480;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A141312 Inverse Euler transform of A003480.
 * @author Georg Fischer
 */
public class A141312 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A141312() {
    super(0, new A003480(), 1);
  }
}

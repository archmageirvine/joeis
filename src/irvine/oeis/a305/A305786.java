package irvine.oeis.a305;
// manually ietman at 2023-02-08 22:11

import irvine.oeis.a133.A133942;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A305786 Inverse Euler transform of (-1)^n * n!.
 * @author Georg Fischer
 */
public class A305786 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A305786() {
    super(1, new A133942(), 1);
    next();
  }
}

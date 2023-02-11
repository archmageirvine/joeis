package irvine.oeis.a018;

import irvine.oeis.a000.A000931;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A018243 Inverse Euler transform of A000931.
 * @author Sean A. Irvine
 */
public class A018243 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A018243() {
    super(1, new A000931(), 1);
    next(); // skip 0th term
  }
}

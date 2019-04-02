package irvine.oeis.a018;

import irvine.oeis.InverseEulerTransformSequence;
import irvine.oeis.a000.A000931;

/**
 * A018243 Inverse Euler transform of A000931.
 * @author Sean A. Irvine
 */
public class A018243 extends InverseEulerTransformSequence {

  /** Construct the sequence. */
  public A018243() {
    super(new A000931(), 1);
    next(); // skip 0th term
  }
}

package irvine.oeis.a071;

import irvine.oeis.InverseSequence;

/**
 * A071893 a(n) = Min_{k | A071891(k) = n}.
 * @author Sean A. Irvine
 */
public class A071893 extends InverseSequence {

  /** Construct the sequence. */
  public A071893() {
    super(1, new A071891());
  }
}

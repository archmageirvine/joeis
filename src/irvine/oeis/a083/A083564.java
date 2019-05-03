package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083564 <code>a(n) = L(n)*L(2n)</code>, where <code>L(n)</code> are the Lucas numbers <code>(A000204)</code>.
 * @author Sean A. Irvine
 */
public class A083564 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083564() {
    super(new long[] {-1, -3, 6, 3}, new long[] {3, 21, 72, 329});
  }
}

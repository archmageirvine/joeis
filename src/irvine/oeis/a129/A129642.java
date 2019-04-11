package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129642 Nonnegative values x of solutions <code>(x,</code> y) to the Diophantine equation <code>x^2+(x+457)^2 =</code> y^2.
 * @author Sean A. Irvine
 */
public class A129642 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129642() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 348, 495, 1371, 3255, 4088, 9140});
  }
}

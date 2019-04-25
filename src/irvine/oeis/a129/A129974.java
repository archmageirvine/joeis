package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129974 Nonnegative values x of solutions <code>(x, y)</code> to the Diophantine equation <code>x^2+(x+937)^2 = y^2</code>.
 * @author Sean A. Irvine
 */
public class A129974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129974() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 627, 1128, 2811, 6188, 9027, 18740});
  }
}

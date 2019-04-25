package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129991 Nonnegative values x of solutions <code>(x, y)</code> to the Diophantine equation <code>x^2+(x+241)^2 = y^2</code>.
 * @author Sean A. Irvine
 */
public class A129991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129991() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 23, 620, 723, 840, 4223, 4820});
  }
}

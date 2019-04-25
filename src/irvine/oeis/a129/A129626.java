package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129626 Nonnegative values x of solutions <code>(x, y)</code> to the Diophantine equation <code>x^2+(x+281)^2 = y^2</code>.
 * @author Sean A. Irvine
 */
public class A129626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129626() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 76, 559, 843, 1239, 3976, 5620});
  }
}

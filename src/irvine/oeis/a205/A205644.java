package irvine.oeis.a205;

import irvine.oeis.LinearRecurrence;

/**
 * A205644 Nonnegative values x of solutions <code>(x, y)</code> to the Diophantine equation <code>x^2+(x+287)^2 = y^2</code>.
 * @author Sean A. Irvine
 */
public class A205644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A205644() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, -6, 6, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 25, 36, 205, 252, 273, 328, 705, 748, 861, 988, 1045, 1968, 2233, 2352, 2665, 4836, 5085, 5740});
  }
}

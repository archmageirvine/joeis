package irvine.oeis.a196;

import irvine.oeis.LinearRecurrence;

/**
 * A196279 Let <code>r= (7n) mod 10</code> and <code>x=floor(7n/10)</code> be the last digit and leading part of <code>7n</code>. Then <code>a(n) = (x-2r)/7</code>.
 * @author Sean A. Irvine
 */
public class A196279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196279() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, -2, -1, 0, -2, -1, 0, -2, -1, 0, 1});
  }
}

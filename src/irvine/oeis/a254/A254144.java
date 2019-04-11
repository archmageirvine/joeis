package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254144 <code>a(n) = 1*6^n + 2*5^n + 3*4^n + 4*3^n + 5*2^n + 6*1^n</code>.
 * @author Sean A. Irvine
 */
public class A254144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254144() {
    super(new long[] {-720, 1764, -1624, 735, -175, 21}, new long[] {21, 56, 196, 812, 3724, 18236});
  }
}

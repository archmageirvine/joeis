package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254364 <code>a(n) = 3*4^n + 10*2^n + 6*3^n + 5^n + 15</code>.
 * @author Sean A. Irvine
 */
public class A254364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254364() {
    super(new long[] {120, -274, 225, -85, 15}, new long[] {35, 70, 182, 574, 2054});
  }
}

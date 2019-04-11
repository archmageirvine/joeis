package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277106 <code>a(n) = 8*3^n - 12</code>.
 * @author Sean A. Irvine
 */
public class A277106 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277106() {
    super(new long[] {-3, 4}, new long[] {12, 60});
  }
}

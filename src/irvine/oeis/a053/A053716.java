package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053716 <code>a(n) = 1111111</code> in base <code>n</code>.
 * @author Sean A. Irvine
 */
public class A053716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053716() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {7, 127, 1093, 5461, 19531, 55987, 137257});
  }
}

package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053716.
 * @author Sean A. Irvine
 */
public class A053716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053716() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {7, 127, 1093, 5461, 19531, 55987, 137257});
  }
}

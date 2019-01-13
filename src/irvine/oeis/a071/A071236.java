package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071236.
 * @author Sean A. Irvine
 */
public class A071236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071236() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 1, 528, 29646, 524800, 4884375, 30236976, 141246028, 536887296, 1743421725, 5000050000L});
  }
}

package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224423.
 * @author Sean A. Irvine
 */
public class A224423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224423() {
    super(new long[] {64, -160, 148, -64, 13}, new long[] {24485, 120741, 613541, 3078309, 15070373});
  }
}

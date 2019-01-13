package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123657.
 * @author Sean A. Irvine
 */
public class A123657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123657() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {4, 593, 20494, 266497, 1969376, 10125649, 40473658, 134483969, 387958492, 1001010001});
  }
}

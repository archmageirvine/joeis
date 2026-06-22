package irvine.oeis.a030;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A030115 Number of antichains in the product of a fence poset with n elements and a chain with 10 elements; also number of paths with n turns when light is reflected from 11 glass plates.
 * @author Sean A. Irvine
 */
public class A030115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030115() {
    super(new long[] {-1, 1, 10, -9, -36, 28, 56, -35, -35, 15, 6}, new long[] {1, 11, 66, 506, 3641, 26818, 196119, 1437799, 10532302, 77173602, 565424068});
  }
}

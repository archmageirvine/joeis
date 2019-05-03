package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217331 Number of inequivalent ways to color a <code>3 X 3</code> checkerboard using at most n colors allowing rotations and reflections.
 * @author Sean A. Irvine
 */
public class A217331 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217331() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1, 102, 2862, 34960, 252375, 1284066, 5105212, 16912512, 48700845});
  }
}
